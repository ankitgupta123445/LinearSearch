package Main;

import BinarySearch.BinarySearch;
import Exception.NumberNotFoundException;
import LinearSearch.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                final Scanner sc = new Scanner(System.in);
                System.out.println("Howmany elements would you want to add in array");
                int arrayLength = sc.nextInt();
                int[] array = new int[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                        array[i] = (int) (Math.random() * 100);
                }
                System.out.println(Arrays.toString(array));
                System.out.println("enter 1 for LinearSearch");
                System.out.println("enter 2 for binarySearch");
                int ch = sc.nextInt();
                System.out.println("enter the number which you want to search");
                int number = sc.nextInt();
                switch (ch) {
                        case 1:
                                try {
                                        LinearSearch linearSearch = new LinearSearch();
                                        int index = linearSearch.search(array, number);
                                        System.out.println(number + " is found at the index " + index);
                                } catch (NumberNotFoundException e) {
                                        System.out.println(e.getMessage());
                                }
                                break;
                        case 2:
                                BinarySearch binarySearch = new BinarySearch();
                                System.out.println("In binary search array must be sorted.");
                                System.out.print("sorted array :");
                                Arrays.sort(array);
                                System.out.println(Arrays.toString(array));
                                try {
                                        int index = binarySearch.search(array, number);
                                        System.out.println(number + " is found at the index " + index);
                                } catch (NumberNotFoundException e) {
                                        System.out.println(e.getMessage());
                                }
                                break;
                }

        }
}
