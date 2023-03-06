public class Sorter {
    private SorterIF sorter;

    public Sorter(SorterIF sorter) {
        this.sorter = sorter;
    }

    public void sort(int[] list) {
        sorter.sort(list);
    }
}
