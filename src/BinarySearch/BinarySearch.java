package BinarySearch;

import Exception.NumberNotFoundException;

public class BinarySearch {
        public int search(int[] array, int number) throws NumberNotFoundException {
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
                        } else {
                                endIndex = mid - 1;
                        }
                }
                if (response == -1) {
                        throw new NumberNotFoundException(number + " is not found in the array");
                } else {
                        return response;
                }
        }
}
