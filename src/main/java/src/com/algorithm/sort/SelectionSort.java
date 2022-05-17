package src.com.algorithm.sort;

final class SelectionSort extends Sort {
    public SelectionSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        System.out.println(this.getClass().getName());
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
                count++;
            }
            super.swap(array, i, minIndex);
        }
        System.out.println("count = " + count);
        return copyArray(array);
    }
}