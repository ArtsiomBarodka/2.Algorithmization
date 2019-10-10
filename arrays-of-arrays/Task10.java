/*
 * 2.Algorithmization
 * Task 10
 * Найти положительные элементы главной диагонали квадратной матрицы.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа находит положительные элементы " +
                "главной диагонали квадратной матрици.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите количество строк и столбцов n");
            n = scanner.nextInt();
        }
        int [][]array = generateArrayOfArray(n,n);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if(i == j){
                    if(array[i][j]>0){
                        System.out.println("Элемент : " + array[i][j]);
                    }
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
