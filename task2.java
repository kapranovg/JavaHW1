package Homework.HW1;

/*
 * Вывести все простые числа от 1 до 1000
 */

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int[] brr = new int[0];
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] % arr[j] == 0) {
                    count += 1;
                }
            }
            if (count <= 2) {
                brr = Arrays.copyOf(brr, brr.length + 1);
                brr[brr.length - 1] = arr[i];
            }
            count = 0;
        }
        System.out.println(Arrays.toString(brr));
    }
}
