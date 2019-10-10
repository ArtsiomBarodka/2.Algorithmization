/*
 * 2.Algorithmization
 * Task 7
 * Сформировать квадратную матрицу порядка N по правилу:
 * и подсчитать количество положительных элементов в ней.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа формирует квадратную матрицу порядка N по" +
                "заданному правилу.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число N");
            n = scanner.nextInt();
        }
        double [][]array = new double[n][n];
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((Math.pow(i,2) + Math.pow(j,2))/n);
                if(array[i][j]>0){
                    count++;
                }
            }
        }
        System.out.println("Матрица имеет вид: ");
        for (double arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Количество положительных элементо = " + count);
    }
}
