package src.com.algorithm;


import src.com.algorithm.sort.SortTypes;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        final int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(SortTypes.values()).forEach(sortType -> System.out.println(Arrays.toString(sortType.sort(intArray))));
    }
}
