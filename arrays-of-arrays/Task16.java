/*
 * 2.Algorithmization
 * Task 16
 * Магическим квадратом порядка n называется квадратная
 * матрица размера nxn, составленная из чисел 1, 2, 3, , n так,
 * что суммы по каждому столбцу, каждой строке и каждой из двух
 * больших диагоналей равны между собой. Построить такой квадрат.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа формирует магический квадрат порядка n.");
        try(Scanner scanner = new Scanner(System.in)){
            while (true) {
                System.out.println("Введите число n большее 2");
                n = scanner.nextInt();
                if(n>2){
                    break;
                }
            }
        }
        int[][]magicSquare = new int[n][n];
        int maxVal = n*((int)Math.pow(n,2)+1)/2;
        System.out.println(maxVal);
        int[]arrayOfVal = new int[(int)Math.pow(n,2)];
        for (int i = 0; i < arrayOfVal.length; i++) {
            arrayOfVal[i] = i+1;
        }
        System.out.println(Arrays.toString(arrayOfVal));
        while (true){
            fillArray(magicSquare,arrayOfVal);
            if(isRowEquallyMaxVal(magicSquare,maxVal)&&
                    isColEquallyMaxVal(magicSquare,maxVal)&&
                    isDiagonalEquallyMaxVal(magicSquare,maxVal)){
                break;
            }
            changeTwoRandomValOfArray(arrayOfVal);
        }
        for (int ar[]:magicSquare) {
            System.out.println(Arrays.toString(ar));
        }
    }

    private static void fillArray(int [][] arrOfArr, int [] arr){
        int index = 0;
        for (int i = 0; i < arrOfArr.length; i++) {
            for (int j = 0; j < arrOfArr[i].length; j++) {
                arrOfArr[i][j] = arr[index];
                index++;
            }
        }
    }

    private static boolean isRowEquallyMaxVal(int [][] array,int maxVal){
        for (int i = 0; i < array.length; i++) {
            int val = 0;
            for (int j = 0; j < array[i].length; j++) {
                val = val + array[i][j];
            }
            if(val != maxVal){
                return false;
            }
        }
        return true;
    }

    private static boolean isColEquallyMaxVal(int [][] array,int maxVal){
        for (int i = 0; i < array.length; i++) {
            int val = 0;
            for (int j = 0; j < array[i].length; j++) {
                val = val + array[j][i];
            }
            if(val != maxVal){
                return false;
            }
        }
        return true;
    }

    private static boolean isDiagonalEquallyMaxVal(int [][] array,int maxVal){
        int val1 = 0;
        int val2 = 0;
        for (int i = 0; i < array.length; i++) {
            val1 = val1 + array[i][i];
            val2 = val2 + array[i][array.length-(1+i)];
        }
        if(val1 == maxVal && val2 == maxVal){
            return true;
        }

        return false;
    }

    private static void changeTwoRandomValOfArray(int[] array){
        int max = array.length-1;
        Random random = new Random();
        int index1 = random.nextInt(max+1);
        int index2;
        while (true){
            index2 = random.nextInt(max + 1);
            if(index1 != index2){
                break;
            }
        }
        int val = array[index1];
        array[index1] = array[index2];
        array[index2] = val;
    }

}
