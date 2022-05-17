package src.com.algorithm.sort;

abstract class Sort {
    protected final int[] array;
    protected int count = 0;
    public Sort(int[] array) {
        this.array = copyArray(array);
    }

    public abstract int[] sort();

    protected final void swap(int[] array, int to, int from) {
        int swap = array[to];
        array[to] = array[from];
        array[from] = swap;
    }

    protected final int[] copyArray(int[] array){
        final int[] returnArray = new int[array.length];
        System.arraycopy(array, 0, returnArray, 0, array.length);
        return returnArray;
    }
}
