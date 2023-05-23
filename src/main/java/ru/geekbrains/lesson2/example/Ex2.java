//Реализуем быструю сортировку массива.
package ru.geekbrains.lesson2.example;

public class Ex2 {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // определение разделителя (pivot)
            int pivot = partition(arr, low, high);

            // рекурсивная сортировка разделенных частей массива
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // выбор последнего элемента в качестве разделителя (можно выбрать и другой)
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // поменять местами arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // поменять местами arr[i+1] и arr[high]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Test code
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        Ex2 ob = new Ex2();
        ob.sort(arr);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
