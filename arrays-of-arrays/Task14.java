/*
 * 2.Algorithmization
 * Task 14
 * Сформировать случайную матрицу m x n,
 * состоящую из нулей и единиц,
 * причем в каждом столбце число единиц равно номеру столбца.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int n;
        int m;
        System.out.println("Программа формирует случайную матрицу с количеством " +
                "строк n и стольцов m.\n Где n >= m. Матрица состоит из нулей и единиц. \n" +
                "В каждом столбце число единиц равно номеру столбцаю.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите количество строк n");
            n = scanner.nextInt();
            while (true){
                System.out.println("Введите количество столбцов m");
                m = scanner.nextInt();
                if(n >= m) {
                    break;
                }
            }
        }
        int [][]array = generateArrayOfArrays(n,m);
    }

    public static int[][] generateArrayOfArrays(int row, int col){
        int result [][] = new int[row][col];
        for (int k = 0; k < col;) {
            int count = 0;
            for (int i = 0; i < row; i++) {
                result[i][k] = generateRandomPositiveValue();
                count = count+ result[i][k];
            }
            if(count == k+1){
                k++;
            }
        }

        for (int arr[]:result) {
            System.out.println(Arrays.toString(arr));
        }
        return result;
    }

    public static int generateRandomPositiveValue(){
        int max = 1;
        int result;
        Random random = new Random();
        result = random.nextInt(max + 1);
        return result;
    }
}
