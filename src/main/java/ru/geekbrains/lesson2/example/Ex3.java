//Делаем проверку скорости сортировки для массива из 10000 элементов обоими способами.
package ru.geekbrains.lesson2.example;

import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int num = rand.nextInt(10000);
            arr1[i] = num;
            arr2[i] = num;
        }

        long startTime = System.currentTimeMillis();
        Ex1.bubbleSort(arr1);
        long endTime = System.currentTimeMillis();
        System.out.println("Время, затраченное на сортировку пузырьком: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        Ex2.quickSort(arr2, 0, arr2.length - 1);
        endTime = System.currentTimeMillis();
        System.out.println("Время, затраченное на быструю сортировку: " + (endTime - startTime) + "ms");
    }
}
