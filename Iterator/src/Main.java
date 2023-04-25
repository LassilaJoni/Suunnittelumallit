import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // A:

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        Thread t1 = new Thread(() -> {
            Iterator<Integer> it1 = numbers.iterator();
            while (it1.hasNext()) {
                System.out.println("Thread 1: " + it1.next());
            }
        });

        Thread t2 = new Thread(() -> {
            Iterator<Integer> it2 = numbers.iterator();
            while (it2.hasNext()) {
                System.out.println("Thread 2: " + it2.next()); // Saattaa tulla ConcurrentModificationException
            }
        });

        t1.start();
        t2.start();

         //B

        List<Integer> numbersb = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbersb.add(i);
        }

        Iterator<Integer> sharedIterator = numbersb.iterator();

        Thread t1b = new Thread(() -> {
            while (sharedIterator.hasNext()) {
                System.out.println("Thread 1: " + sharedIterator.next());
            }
        });

        Thread t2b = new Thread(() -> {
            while (sharedIterator.hasNext()) {
                System.out.println("Thread 2: " + sharedIterator.next());
            }
        });





        t1b.start();
        t2b.start();


        /*
        Thread 1: 0
        Thread 1: 2
        Thread 2: 1
        Thread 1: 3
        Thread 2: 4
        Thread 1: 5
        Thread 2: 6
        Thread 1: 7
        Thread 1: 9
        Thread 2: 8
        */


        //C
        List<Integer> numbersc = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbersc.add(i);
        }

        Iterator<Integer> iterator = numbersc.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Number: " + number);

            if (number == 5) {
                numbersc.remove(number);
            }
        }

        /*
        ConcurrentModificationException
         */



        //D:

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        Iterator<Integer> iteratord = list.iterator();

        while (iteratord.hasNext()) {
            Integer value = iteratord.next();
            System.out.println("Value: " + value);
            if (value == 5) {
                iteratord.remove();
            }
        }

        System.out.println("List after removing number: " + list);

        iteratord = list.iterator();
        iteratord.forEachRemaining(value -> System.out.println("forEachRemaining: " + value));
    }
    }
