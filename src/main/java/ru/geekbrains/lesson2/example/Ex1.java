//Реализуем простой алгоритм сортировки (любой или несколько)
package ru.geekbrains.lesson2.example;

public class Ex1 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main (String[]args){
        int[] arr = {12, 11, 13, 5, 6};
        Ex1 ob = new Ex1();
        ob.bubbleSort(arr);
        System.out.println("Сортировка пузырьком:");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}