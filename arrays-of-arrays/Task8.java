/*
 * 2.Algorithmization
 * Task 8
 * В числовой матрице поменять местами два столбца любых столбца,
 * т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого,
 * а его элементы второго переместить в первый.
 * Номера столбцов вводит пользователь с клавиатуры.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n, m, k, p;
        System.out.println("Программа формирует матрицу с количеством строк n " +
                "и стольцов m.\n Меняет  местами два любых столбца. " +
                "Первый со вторым");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            System.out.println("Введите количество столбцов m");
            m = scanner.nextInt();
            System.out.println("Введите первый столбец ");
            k = scanner.nextInt();
            System.out.println("Введите второй столбец ");
            p = scanner.nextInt();
        }
        int [][] array = generateArrayOfArray(n,m);
        int [] firstColumn = findColumnFromArrayOfArray(k,array);
        int[] secondColumn = findColumnFromArrayOfArray(p,array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j == p-1){
                    array[i][j] = firstColumn[i];
                }
                if(j == k-1){
                    array[i][j] = secondColumn[i];
                }
            }
        }
        System.out.println("Результат");

        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[] findColumnFromArrayOfArray(int colNumber, int arr[][]){
        int result [] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == colNumber-1){
                    result[i] = arr[i][j];
                }
            }
        }
        return result;
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
