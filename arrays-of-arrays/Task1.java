/*
 * 2.Algorithmization
 * Task 1
 * Дана матрица.
 * Вывести на экран все нечетные столбцы, у которых
 * первый элемент больше последнего.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n ;
        int m ;
        int [][]result;
        System.out.println("Программа выводит на экран все нечетные столбцы, " +
                "у которых первый элемент больше последнего.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
        }
        int [][]array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = generateRandomPositiveNegativeValue();
            }
        }
        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }

        for (int i = 0; i < m ; i++) {
           if(i%2 != 0){
               if(array[0][i]>array[n-1][i]){
                   result = new int[n][1];
                   for (int j = 0; j < n; j++) {
                       result[j][0] = array[j][i];
                   }
                   System.out.println("Столбец");
                   for (int arr[]: result) {
                       System.out.println(Arrays.toString(arr));
                   }

               }
           }
        }
    }

    public static int generateRandomPositiveNegativeValue(){
        int max = 200;
        int avr = 100;
        int result;
        Random random = new Random();
        result = random.nextInt(max + 1) - avr;
        return result;
    }
}
