import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int size = 50000;

        int[] list = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list[i] = random.nextInt(1000) + 1;
        }

        int[] insertionList = Arrays.copyOf(list, size);
        int[] selectionList = Arrays.copyOf(list, size);

        Sorter bubble = new Sorter(new Bubblesort());
        Sorter selection = new Sorter(new Selectionsort());
        Sorter insertion = new Sorter(new Insertionsort());

        long start = System.currentTimeMillis();
        bubble.sort(list);
        long end = System.currentTimeMillis();
        System.out.printf("Bubble Sort: %d milliseconds\n", end - start);

        start = System.currentTimeMillis();
        insertion.sort(insertionList);
        end = System.currentTimeMillis();
        System.out.printf("Insertion Sort: %d milliseconds\n", end - start);

        start = System.currentTimeMillis();
        selection.sort(selectionList);
        end = System.currentTimeMillis();
        System.out.printf("Selection Sort: %d milliseconds\n", end - start);

        /*
        Bubble Sort: 5639 milliseconds
        Insertion Sort: 203 milliseconds
        Selection Sort: 1082 milliseconds
        */
    }
}