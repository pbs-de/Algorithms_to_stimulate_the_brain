package src.com.algorithm.sort;

public class QuickSort extends Sort {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    public int[] sort() {
        quickSort(0, array.length - 1);
        return copyArray(array);
    }

    private void quickSort(int left, int right) {
        if (left >= right) return;
        int pivot = this.partition(left, right);
        quickSort(left, pivot - 1);
        quickSort(pivot + 1, right);
        count++;
    }

    private int partition(int left, int right) {
        int pivot = left;
        int start = left + 1;
        int end = right;
        while (start <= end) {
            while (start <= end && array[start] <= array[pivot]) ++start;
            while (start <= end && array[end] >= array[pivot]) --end;
            if(start <= end){
                swap(start, end);
            }
        }
        swap(pivot, end);
        return end;
    }
}
