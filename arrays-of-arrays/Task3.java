/*
 * 2.Algorithmization
 * Task 3
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n ,m ,k ,p;
        System.out.println("Программа выводит k-ю строку и p-й столбец матрицы.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
            System.out.println("Введите k");
            k = scanner.nextInt();
            System.out.println("Введите p");
            p = scanner.nextInt();
        }
        int [][]array = generateArrayOfArray(n,m);
        int []result = new int[n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == k){
                System.out.print(k+"-ая строка : ");
                System.out.println(Arrays.toString(array[i]));
            }
            for (int j = 0; j < array[i].length; j++) {
                if(j == p){
                    result[count] = array[i][j];
                    count++;
                }
            }
        }
        System.out.print(p+"-ый столбец : ");
        System.out.println(Arrays.toString(result));

    }

    public static int[][] generateArrayOfArray(int row, int col){
        int result [][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = generateRandomPositiveNegativeValue();
            }
        }
        for (int arr[]:result) {
            System.out.println(Arrays.toString(arr));
        }
        return result;
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
