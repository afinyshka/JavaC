package Seminar_3;

public class HeapSort {
    public static void main(String[] args) {
        int[] iniArr = { 7, 19, 100, 756, 2, 6, 3, 1, 89, -1 };
        System.out.println("Initial array: ");
        printArr(iniArr);
        heapSort(iniArr);
        System.out.println("Heapsorted array: ");
        printArr(iniArr);
    }


    private static void printArr(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int largest = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if (l < n && arr[l] > arr[largest]) {
           largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }
    }
}
