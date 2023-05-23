//Реализуем бинарный поиск
package ru.geekbrains.lesson2.example;

public class Ex4 {
    public static int binarySearch(int[] sortedArray, int key) {
        int first = 0;
        int last = sortedArray.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (sortedArray[mid] == key) {
                return mid;
            } else if (sortedArray[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int key = 23;
        int index = binarySearch(arr, key);
        if (index == -1) {
            System.out.println("Элемент не найден.");
        } else {
            System.out.println("Элемент найден в индексе " + index);
        }
    }
}