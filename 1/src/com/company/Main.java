package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
   int[] arr = new int[100];
   Random random = new Random();
   for (int i = 0; i < arr.length; i++) {
     arr[i] = random.nextInt(200);
   }
   
   Arrays.sort(arr);
   System.out.println(Arrays.toString(arr));
   
   System.out.println(binSearch(arr, 58));
  }
  
  public static boolean binSearch(int[] arr, int number) {
    int startIndex = 0;
    int endIndex = arr.length - 1;
    int meanIndex = (startIndex + endIndex) / 2;
    while ((arr[meanIndex] != number) && (startIndex <= endIndex)) {
      if (arr[meanIndex] > number) {
        endIndex = meanIndex - 1;
      }
      else {
        startIndex = meanIndex + 1;
      }
      meanIndex = (startIndex + endIndex) / 2;
    }
    if (startIndex <= endIndex) {
      return true;
    }
    return false;
  }
}
