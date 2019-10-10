/*
 * 2.Algorithmization
 * Task 6
 * Сформировать квадратную матрицу порядка
 * n по заданному образцу(n - четное):
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int n;
        boolean marker = true;
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
        int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (count >= n/2) {
                marker = false;
            }
            if(count-1 == n/2-1){
                count = n/2-1;
            }
            for (int j = 0+count; j < array[i].length - count ; j++) {
                array[i][j] = 1;
            }
            if(marker){
                count++;
            } else {
                count--;
            }
        }

        for (int arr[]:array) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
