/*
 * 2.Algorithmization
 * Task 3
 * Сортировка выбором.
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Сортировка выбором:\n" +
                "Дана последовательность чисел а1<a2<a3....<an. ");
        int array[] = sortArrayForTask(generateRandomPositiveArray());
        System.out.println("До сортировки: \n"+Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            for (int j = 1+i; j < array.length; j++) {
                if(max<array[j]){
                    int val = max;
                    max = array[j];
                    array[j] = val;
                }
            }
            array[i]= max;
        }
        System.out.println("После: \n"+Arrays.toString(array));
    }

    public static int[] sortArrayForTask(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = 1 + i; j < arr.length; j++) {
                if(min > arr[j]){
                    int val = min;
                    min = arr[j];
                    arr[j] = val;
                }
            }
            arr[i] = min;
        }
        return arr;
    }

    public static int [] generateRandomPositiveArray(){
        int max = 100;
        int[]result = new int[20];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max + 1);
        }
        return result;
    }
}
