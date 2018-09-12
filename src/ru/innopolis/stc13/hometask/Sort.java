package ru.innopolis.stc13.hometask;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Sort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = IntStream.generate(() -> random.nextInt(200) - 100).limit(100).toArray();
        System.out.println(Arrays.toString(array));

        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }


       public static void sort(int[] A, int low, int high) {
        int i = low;
        int j = high;
        int x = A[low+(high-low)/2];
        do {
            while(A[i] < x) ++i;
            while(A[j] > x) --j;
            if(i <= j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i ++ ; j --;
            }
        } while(i <= j);
        //рекурсивные вызовы функции qSort
        if(low < j) sort(A, low, j);
        if(i < high) sort(A, i, high);
    }
}
