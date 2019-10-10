/*
 * 2.Algorithmization
 * Task 12
 * Отсортировать строки матрицы по возрастанию
 * и убыванию значений элементов.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n;
        int m;
        System.out.println("Программа формирует матрицу с количеством строк n " +
                "и стольцов m.\n Сортирует строки по возрастанию и убыванию. ");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
        }
        int [][]array = sortRowOfArrayOfArraysAscending(generateArrayOfArray(n,m));
        System.out.println("После сортировки по возрастанию.");
        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Матрица");
        array = sortRowOfArrayOfArraysDescending(generateArrayOfArray(n,m));
        System.out.println("После сортировки по убыванию.");
        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int [][]sortRowOfArrayOfArraysDescending(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                int max = arr[i][j];
                for (int k = arr[i].length-1; k >= 0+j; k--) {
                    if(max < arr[i][k]){
                        int val = max;
                        max = arr[i][k];
                        arr[i][k]= val;
                    }
                }
                arr[i][j] = max;
            }
        }
        return arr;

    }

    public static int [][]sortRowOfArrayOfArraysAscending(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int min = arr[i][j];
                for (int k = 0+j; k < arr[i].length; k++) {
                    if(min > arr[i][k]){
                        int val = min;
                        min = arr[i][k];
                        arr[i][k]= val;
                    }
                }
                arr[i][j] = min;
            }
        }
        return arr;
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
