public class HardDrive {
    String read(long lba, int size) {
        System.out.println("lba: " + lba + ", size: " + size);


        return String.valueOf(lba);
    }
}
