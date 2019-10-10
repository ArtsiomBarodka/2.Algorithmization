/*
 * 2.Algorithmization
 * Task 5
 * Составить программу, которая в массиве A[N] находит
 * второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива,
 * но больше всех других элементов)
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа в массиве A[N] находит " +
                "второе по величине число.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите n ");
            n = scanner.nextInt();
        }
        int [] array = generateRandomPositiveNegativeArray(n);
        System.out.println(Arrays.toString(array));
        int result = findSecondMaxValueInArray(array);
        System.out.println("Второе по величине число "+result);
    }

    public static int findSecondMaxValueInArray(int arr[]){
        int maxVal = findMaxValueInArray(arr);
        int result =(arr[0]<maxVal) ? arr[0] : arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(result < arr[i] && arr[i] != maxVal){
                result = arr[i];
            }
        }
        return result;
    }

    public static int findMaxValueInArray(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int [] generateRandomPositiveNegativeArray(int n){
        int max = 100;
        int []result = new int[n];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max*2 + 1) - max;
        }
        return result;
    }
}
