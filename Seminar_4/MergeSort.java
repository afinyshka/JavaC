package Seminar_4;
/*
Сортировка слиянием. Затрачиваемое время O(n log2 n). Сортировка считается достаточно быстрой.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] iniArr = { 7, 19, 100, 756, 2, 6, 3, 1, 89, -1 };
        // int[] iniArr = { 2, 1, 5, 4, 8};
        System.out.println("Initial array: ");
        printArr(iniArr);
        mergeSort(iniArr);
        System.out.println("Heapsorted array: ");
        printArr(iniArr);
    }


    public static int [] mergeSort(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        int [] arrayLL = new int [array.length/2];
        System.arraycopy(array, 0, arrayLL, 0, array.length/2);

        int [] arrayRR = new int [array.length -  array.length/2];
        System.arraycopy(array, arrayLL.length, arrayRR, 0, array.length - arrayLL.length);

        mergeSort(arrayLL);
        mergeSort(arrayRR);
        //рекурсия возврата слияния двух отсортированных массивов
        mergeArray(array, arrayLL, arrayRR);
        return array;
    }

    private static int[] mergeArray(int[] array, int[] arrayL, int[] arrayR) {
        int posL = 0;
        int posR = 0;
        for (int i = 0; i < array.length; i++) {
            if (posL == arrayL.length) {
                array[i] = arrayR[posR];
                posR++;
            } else if (posR == arrayR.length) {
                array[i] = arrayL[posL];
                posL++;
            } else if (arrayL[posL] < arrayR[posR]) {
                array[i] = arrayL[posL];
                posL++;
            } else if (arrayL[posL] > arrayR[posR]) {
                array[i] = arrayR[posR];
                posR++;
            }
        }
        return array;
    }

    private static void printArr(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
