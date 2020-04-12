package BinarySearch;
import Exception.NumberNotFoundException;

import java.util.Arrays;

public class BinarySearch {
        public int search(int[] array, int number) throws NumberNotFoundException {
                Arrays.sort(array);
                int response = -1;
                int startIndex = 0;
                int endIndex = array.length - 1;
                while (startIndex <= endIndex) {
                        int mid = (startIndex + endIndex) / 2;
                        if (array[mid] == number) {
                                response = mid;
                                break;
                        }
                        if (array[mid] < number) {
                                startIndex = mid + 1;
                        }
                        if (array[mid] > number) {
                                endIndex = mid - 1;
                        }
                }
                return response;
        }
}
