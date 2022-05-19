package src.com.algorithm.sort;

public enum SortTypes {
    BUBBLE(arr -> new BubbleSort(arr).sort()),
    SELECTION(arr -> new SelectionSort(arr).sort()),
    INSERTION(arr -> new InsertionSort(arr).sort()),
    QUICK(arr -> new QuickSort(arr).sort());

    SortTypes(SortFunction sortFunction) {
        this.sortFunction = sortFunction;
    }

    private SortFunction sortFunction;

    public int[] sort(int[] array){
        return sortFunction.sort(array);
    }


}
