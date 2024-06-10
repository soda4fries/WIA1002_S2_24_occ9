/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author xinph
 */
import java.util.Arrays;

public class LabSearchSort {
    public static void main(String[] args) {
        int[] arr1 = {45, 7, 2, 8, 19, 3};

        // Sorting using selectionSortSmallest
        int[] arr1Clone1 = arr1.clone();
        selectionSortSmallest(arr1Clone1);
        System.out.println("Array after selectionSortSmallest: " + Arrays.toString(arr1Clone1));

        // Sorting using selectionSortLargest
        int[] arr1Clone2 = arr1.clone();
        selectionSortLargest(arr1Clone2);
        System.out.println("Array after selectionSortLargest: " + Arrays.toString(arr1Clone2));

        // Sorting using insertionSort
        int[] arr2 = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(arr2);
        System.out.println("Array after insertionSort: " + Arrays.toString(arr2));
    }

    public static void selectionSortSmallest(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSortLargest(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
