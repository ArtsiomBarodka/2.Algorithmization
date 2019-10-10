/*
 * 2.Algorithmization
 * Task 8
 * Задан массив D. Определить следующие суммы:
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех
 * последовательно расположенных элементов
 * массива с номерами от k до m.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int m;
        int k;
        System.out.println("Метод вычисляет сумму " +
                "последовательно расположенных элементов массива с " +
                "номерами от k до m");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число k ");
            k = scanner.nextInt();
            System.out.println("Введите число m ");
            m = scanner.nextInt();
        }
        int array[] =generateRandomPositiveArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println("Результат "+sumValuesOfArray(array,k,m));
    }

    public static int sumValuesOfArray(int arr[], int k, int m){
        int sum = 0;
        int index1;
        int index2;
        if(arr.length-1 < k && arr.length-1 < m){
            return -1;
        }
        if(m > k) {
            index2 = m;
            index1 = k;
        } else {
            index2 = k;
            index1 = m;
        }
        for (int i = index1; i <= index2; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int [] generateRandomPositiveArray(int length){
        int max = 100;
        int []result = new int[length];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max + 1);
        }
        return result;
    }
}
