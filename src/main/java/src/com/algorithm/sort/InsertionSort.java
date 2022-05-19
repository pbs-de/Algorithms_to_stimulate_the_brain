package src.com.algorithm.sort;

final class InsertionSort extends Sort {
    public InsertionSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    swap(j, j - 1);
                } else {
                    break;
                }
                count ++;
            }
        }
        return copyArray(array);
    }
}
