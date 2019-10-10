/*
 * 2.Algorithmization
 * Task 15
 * Найдите наибольший элемент матрицы и
 * заменить все нечетные элементы на него.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int n;
        int m;
        System.out.println("Программа формирует матрицу с количеством строк n " +
                "и стольцов m.\nНаходит наибольший элемент матрици. \n" +
                "Заменяет все нечетные элементы на наибольший. ");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
        }
        int [][]array = generateArrayOfArrays(n,m);
        int maxVal = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(maxVal < array[i][j]){
                    maxVal = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]%2 != 0){
                    array[i][j] = maxVal;
                }
            }
        }
        System.out.println("Матрица после замены имеет вид: ");
        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[][] generateArrayOfArrays(int row, int col){
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
