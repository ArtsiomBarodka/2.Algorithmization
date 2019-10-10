/*
 * 2.Algorithmization
 * Task 5
 * Сформировать квадратную матрицу порядка
 * n по заданному образцу(n - четное):
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа формирует квадратную матрицу порядка n по" +
                " заданному образцу (n - четное).");
        try(Scanner scanner = new Scanner(System.in)){
            while (true) {
                System.out.println("Введите четное число n");
                n = scanner.nextInt();
                if(n%2 == 0){
                    break;
                }
            }
        }
        int [][]array = new int[n][n];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length-(1+i); j >= 0 ; j--) {
                array[i][j] = count;
            }
            count++;
        }

        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
