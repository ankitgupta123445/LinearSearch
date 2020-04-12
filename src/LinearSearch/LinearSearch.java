package LinearSearch;

import Exception.NumberNotFoundException;

public class LinearSearch {
        public int search(int[] array, int number) throws NumberNotFoundException {
                int response = -1;
                for (int i = 0; i < array.length; i++) {
                        if (array[i] == number) {
                                response = i;
                                break;
                        }
                }
                if (response == -1)
                        throw new NumberNotFoundException(number + "is not found in the array");
                else
                        return response;
        }
}
