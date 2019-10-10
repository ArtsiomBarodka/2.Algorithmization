/*
 * 2.Algorithmization
 * Task 2
 * Дана квадратная матрица. Вывести на экран элементы,
 * стоящие на диагонали
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n ;
        System.out.println("Программа выводит на экран все элементы по " +
                "диагонали у квадратной матрици.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите количество строк и столбцов n");
            while (!scanner.hasNextInt()){
                scanner.next();
            }
            n = scanner.nextInt();
        }
        int [][]array = generateArrayOfArray(n,n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println("Элементы по диагонали:");
                if(i == j){
                    System.out.print(array[i][j]);
                }
            }
        }

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
