/*
 * 2.Algorithmization
 * Task 5
 * Сортировка вставками
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int array [] = generateRandomPositiveArray();
        System.out.println("Сортировка вставками:\n" +
                "Дана последовательность чисел а1,a2,a3...,an. ");
        System.out.println("До сортировки: \n"+ Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int key = binarySearch(array,array[i],0,i-1);
            int val = array[i];
            for (int j = i; j > key; j--) {
                array[j] = array[j-1];
            }
            array[key]= val;
        }
        System.out.println("После сортировки: \n"+ Arrays.toString(array));

    }

    private static int binarySearch(int arr[],
                                    int element,
                                    int firstIndex,
                                    int lastIndex){
        int middleIndex;
        int result = 0;
        while (firstIndex <= lastIndex){
            middleIndex = (firstIndex + lastIndex)/2;
            if(arr[middleIndex] == element){
                return middleIndex+1;
            } else if(arr[middleIndex] < element){
                firstIndex = middleIndex+1;
            } else if(arr[middleIndex] > element){
                lastIndex = middleIndex-1;
            }
            result = arr[middleIndex] < element? middleIndex+1 : middleIndex;

        }
        return result;

    }

    public static int [] generateRandomPositiveArray(){
        int max = 100;
        int []result = new int[20];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max + 1);
        }
        return result;
    }
}
