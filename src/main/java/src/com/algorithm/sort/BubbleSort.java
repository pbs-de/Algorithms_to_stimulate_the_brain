package src.com.algorithm.sort;

final class BubbleSort extends Sort {
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        System.out.println(this.getClass().getName());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
                count++;
            }
        }
        System.out.println("count = " + count);
        return copyArray(array);
    }
}