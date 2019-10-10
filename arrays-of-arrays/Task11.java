/*
 * 2.Algorithmization
 * Task 11
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Программа формирует матрицу 10х20. \n" +
                "Заполняет ее случайными числами от 0 до 15. \n" +
                "Выводит на экран матрицу и номера строк," +
                "в которых число 5 встречается три и более раз.");
        int  array[][] = generateArrayOfArray(10,20);
        for (int i = 0; i < array.length ; i++) {
            int count = 3;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 5){
                    count--;
                }
                if(count == 0){
                    System.out.println("Строка " + (i+1));
                    break;
                }
            }
        }
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
        int max = 15;
        int result;
        Random random = new Random();
        result = random.nextInt(max + 1);
        return result;
    }
}
