public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1); //using a function to swap numbers
                } //if
            } //for
        } //for

    }

    //function that swaps numbers
    void swap(int[] b, int i, int j) {
        int temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }

}
