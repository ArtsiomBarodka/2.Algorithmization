/*
 * 2.Algorithmization
 * Task 13
 * Отсотрировать стобцы матрицы по возрастанию
 * и убыванию значений эементов.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int n;
        int m;
        System.out.println("Программа формирует матрицу с количеством строк n " +
                "и стольцов m.\n Сортирует столбцы по возрастанию и убыванию. ");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
        }
        int[][]array = sortColOfArrayOfArraysDescending(generateArrayOfArray(n,m));
        System.out.println("После сортировки по по убыванию.");
        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Матрица");
        array = sortColOfArrayOfArraysAscending(generateArrayOfArray(n,m));
        System.out.println("Послеубыванию сортировки по возрастанию.");
        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int [][]sortColOfArrayOfArraysAscending(int arr[][]){
        int minVal[] = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                minVal[j] = arr[i][j];
            }
            for (int j = 1+i; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if(minVal[k] > arr[j][k]){
                        int val = minVal[k];
                        minVal[k] = arr[j][k];
                        arr[j][k]= val;
                    }
                }
            }
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = minVal[j];
            }
        }
        return arr;
    }

    public static int [][]sortColOfArrayOfArraysDescending(int arr[][]){
        int maxVal[] = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                maxVal[j] = arr[i][j];
            }
            for (int j = 1+i; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if(maxVal[k] < arr[j][k]){
                        int val = maxVal[k];
                        maxVal[k] = arr[j][k];
                        arr[j][k]= val;
                    }
                }
            }
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = maxVal[j];
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
