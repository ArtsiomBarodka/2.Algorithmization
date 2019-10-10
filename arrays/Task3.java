/*
 * 2.Algorithmization
 * Task 3
 * Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int array [];
        int n;
        int plus = 0;
        int minus = 0;
        int zero = 0;
        System.out.println("Дан массив чисел, размерность которого N. \n" +
                "Программа подсчитывает, сколько в нем отрицательных элементов,\n" +
                " сколько положилельных и нулевых. ");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число N");
            n = scanner.nextInt();
        }
        array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = generateRandomPositiveNegativeValue();
            if (array[i] > 0){
                plus++;
            } else if(array[i] < 0){
                minus++;
            } else {
                zero++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Положительных = "+ plus + "\n" +
                "Отрицательных = " + minus + "\n" +
                "Нулевых = "+zero);
    }

    public static int generateRandomPositiveNegativeValue(){
        int max = 50000;
        int avr = 25000;
        int result;
        Random random = new Random();
        result = random.nextInt(max + 1) - avr;
        return result;
    }
}
