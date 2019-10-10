/*
 * 2.Algorithmization
 * Task 9
 * Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int n, m;
        System.out.println("Программа формирует матрицу с количеством строк n " +
                "и стольцов m.\n Считает сумму элементво в каждом столбце. \n" +
                "Определяет какой столбец содержит максимальную сумму.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
        }
        int[][]array = generateArrayOfArray(n,m);
        int[]sumOfColumn = new int[m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfColumn[j] = sumOfColumn[j] + array[i][j];
            }
        }
        int index = 0;
        int sum = sumOfColumn[index];
        System.out.println("Сумма элементво в каждом столбце : ");
        for (int i = 0; i < sumOfColumn.length; i++) {
            System.out.println("Столбец "+ (i+1) +" = " + sumOfColumn[i] );
            if (sumOfColumn[i]>sum){
                sum = sumOfColumn[i];
                index = i;
            }
        }
        System.out.println("Столбцец с наибольшей суммой "+ (index+1) + " = " + sum);

    }

    public static int[][] generateArrayOfArray(int row, int col){
        int result [][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = generateRandomPositiveValue();
            }
        }
        for (int arr[]:result) {
            System.out.println(Arrays.toString(arr));
        }
        return result;
    }

    public static int generateRandomPositiveValue(){
        int max = 100;
        int result;
        Random random = new Random();
        result = random.nextInt(max + 1);
        return result;
    }
}
