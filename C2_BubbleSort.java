// Java program for implementation  of Bubble Sort

import java.util.Scanner;

public class C2_BubbleSort {  
  public void Sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Elements after Sorting: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.print("");

    }
}