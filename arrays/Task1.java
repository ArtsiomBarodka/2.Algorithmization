/*
 * 2.Algorithmization
 * Task 1
 * В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int array [];
        int n;
        int k;
        System.out.println("В массив A[N] занесены натуральные числа.\n" +
                "Программа находит сумму тех элементов, которые кратны K");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число N");
            while (!scanner.hasNextInt()){
               scanner.next();
            }
            n = scanner.nextInt();
            System.out.println("Введите число K");
            while (!scanner.hasNextInt()){
                scanner.next();
            }
            k = scanner.nextInt();
        }
            array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i-1] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(findSum(array,k));
    }

    public static int findSum(int a[],int k){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%k == 0){
                result = result+a[i];
            }
        }
        return result;
    }
}
