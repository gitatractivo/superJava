package one.prac.rec;

import java.util.Arrays;

public class heap {

    public class HeapSort {
        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
            System.out.println("Original Array: " + Arrays.toString(array));

            heapSort(array);

            System.out.println("Sorted Array: " + Arrays.toString(array));
        }

        public static void heapSort(int[] array) {
            int n = array.length;

            // Build a max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(array, n, i);
            }

            // Extract elements from the heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Swap the root (maximum element) with the last element
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // Call max heapify on the reduced heap
                heapify(array, i, 0);
            }
        }

        // Heapify a subtree rooted at node 'i'
        public static void heapify(int[] array, int n, int i) {
            int largest = i;    // Initialize largest as the root
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;

            // If left child is larger than root
            if (leftChild < n && array[leftChild] > array[largest]) {
                largest = leftChild;
            }

            // If right child is larger than largest so far
            if (rightChild < n && array[rightChild] > array[largest]) {
                largest = rightChild;
            }

            if (largest != i) {
                int swap = array[i];
                array[i] = array[largest];
                array[largest] = swap;

                heapify(array, n, largest);
            }
        }
    }

}
