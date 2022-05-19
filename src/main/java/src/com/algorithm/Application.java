package src.com.algorithm;


import src.com.algorithm.sort.SortTypes;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        final int[] intArray = {3, 5, 1, 7, 9, 2, 6, 8, 0, 4, 1, 3};
        Arrays.stream(SortTypes.values()).forEach(sortType -> Application.printSortResult(sortType, intArray));
    }

    public static void printSortResult(SortTypes sortType, int[] intArray){
        System.out.println(sortType.name() + " SORT");
        System.out.printf("sorted array : %s\n", Arrays.toString(sortType.sort(intArray)));
        System.out.println("=============================================================");
    }
}
