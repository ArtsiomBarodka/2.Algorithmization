/*
 * 2.Algorithmization
 * Task 6
 * Сортировка Шелла.
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int n;
        System.out.println("Сортировка Шелла:\n" +
                "Дан массив n действительных чисел: ");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите n ");
            n = scanner.nextInt();
        }
        int []array = generateRandomPositiveAndNegativeArray(n);
        System.out.println("До сортировки: \n"+ Arrays.toString(array));
        for (int i = 0; i < array.length-1;) {
            if(array[i]<=array[i+1]){
                i++;
            } else if(array[i] > array[i+1]){
                int val = array[i];
                array[i] = array[i+1];
                array[i+1] = val;
                if(i == 0){
                    i++;
                } else {
                    i--;
                }
            }
        }
        System.out.println("После сортировки: \n"+ Arrays.toString(array));
    }

    public static int [] generateRandomPositiveAndNegativeArray(int length){
        int max = 100;
        int result [] = new int[length];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max*2 + 1) - max;
        }
        return result;
    }

}
