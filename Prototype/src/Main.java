public class Main {
    public static void main(String[] args) {
        ClockHands originalClock = new ClockHands();
        originalClock.setHour(10);
        originalClock.setMinute(30);

        // Deep
        ClockHands deepCopyClock = (ClockHands) originalClock.clone();
        System.out.println("Alkuperäinen kello: " + originalClock);
        System.out.println("Syväkopio kello: " + deepCopyClock);

        originalClock.setHour(9);
        originalClock.setMinute(45);
        System.out.println("Alkuperäinen kello muutoksien jälkeen: " + originalClock);
        System.out.println("Syväkopio kello muutoksien jälkeen: " + deepCopyClock);

        // Shallow
        ClockHands shallowCopyClock = originalClock;
        System.out.println("Matalakopio kello: " + shallowCopyClock);

        originalClock.setHour(11);
        originalClock.setMinute(15);
        System.out.println("Alkuperäinen kello muutoksien jälkeen: " + originalClock);
        System.out.println("Matalakopio kello muutoksien jälkeen: " + shallowCopyClock);
        /*
        setHour(10); setMinute(30);
        Alkuperäinen kello: Kello tyyppi: Kello viisareilla, tunti: 10, Minuutti: 30
        Syväkopio kello: Kello tyyppi: Kello viisareilla, tunti: 10, Minuutti: 30

        setHour(9); setMinute(45);
        Alkuperäinen kello muutoksien jälkeen: Kello tyyppi: Kello viisareilla, tunti: 9, Minuutti: 45
        Syväkopio kello muutoksien jälkeen: Kello tyyppi: Kello viisareilla, tunti: 10, Minuutti: 30

        Matalakopio kello: Kello tyyppi: Kello viisareilla, tunti: 9, Minuutti: 45

        setHour(11); setMinute(15);
        Alkuperäinen kello muutoksien jälkeen: Kello tyyppi: Kello viisareilla, tunti: 11, Minuutti: 15
        Matalakopio kello muutoksien jälkeen: Kello tyyppi: Kello viisareilla, tunti: 11, Minuutti: 15

         */


    }
}