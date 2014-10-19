package binarysearch;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class BinarySearchInArray {
    //    Создаите массив из чисел 11,23,17,5,16и3.
    public static void main(String[] args) {
        int[] ints = new int[]{11, 23, 17, 5, 16, 3};

        sort(ints);
        for (int i : ints) {
            System.out.println(i);
        }

        System.out.println("---------------------------");
        System.out.println(Arrays.binarySearch(ints, 3));
        System.out.println(Arrays.binarySearch(ints, 16));
        System.out.println(Arrays.binarySearch(ints, 5));
        System.out.println(Arrays.binarySearch(ints, 17));
        System.out.println(Arrays.binarySearch(ints, 23));
        System.out.println(Arrays.binarySearch(ints, 11));
    }
}
