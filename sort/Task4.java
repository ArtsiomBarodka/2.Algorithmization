/*
 * 2.Algorithmization
 * Task 4
 * Сортировка обменами
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Сортировка обменами:\n" +
                "Дана последовательность чисел а1<a2<a3....<an. ");
        int array[] = generateRandomPositiveArray();
        System.out.println("До сортировки: \n"+ Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j-1]>array[j]){
                    count++;
                    int val = array[j];
                    array[j] = array[j-1];
                    array[j-1] = val;
                }
            }
        }
        System.out.println("После сортировки: \n"+ Arrays.toString(array) +
                "\nКолличество перестановок = " + count);
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
