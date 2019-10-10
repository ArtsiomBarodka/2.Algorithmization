/*
 * 2.Algorithmization
 * Task 2
 * Даны две последовательности : a1<a2<a3<...<an и b1<b2<b3<...<bm
 * Образовать из них новую последовательность чисел так,
 * чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Программа из двух последовательностей:\n" +
                 "a1<a2<a3<...<an и b1<b2<b3<...<bm \n" +
                "формирует новую последовательность, тоже не убывающую.");
        int array1[] = sortArrayForTask(generateRandomPositiveArray());
        int array2[] = sortArrayForTask(generateRandomPositiveArray());
        int index1 = 0;
        int index2 = 0;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int result[] = new int[array1.length+array2.length];
        for (int i = 0; i < result.length; i++) {
            if(index1 == array1.length){
                result[i] = array2[index2];
                index2++;
            } else if(index2 == array2.length){
                result[i] = array1[index1];
                index1++;
            } else if(array1[index1] <= array2[index2]){
                result[i] = array1[index1];
                index1++;
            } else {
                result[i] = array2[index2];
                index2++;
            }
        }
        System.out.println("Результат: ");
        System.out.println(Arrays.toString(result));

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
        int []result = new int[20];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max + 1);
        }
        return result;
    }
}
