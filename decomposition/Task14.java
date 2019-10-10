/*
 * 2.Algorithmization
 * Task 14
 * Натуральное число, в записи которого n цифр,
 * называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int k;
        System.out.println("Программа находит все " +
                "числа Армстронга от 1 до k");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число k ");
            k = scanner.nextInt();
        }
        System.out.println("Результат : ");
        toStringArray(findArmstrongNumbers(1,k));

    }

    public static int [] findArmstrongNumbers(int start, int end){
        int []list = new int[(end-start)+1];
        int count = 0;
        for (int i = start; i <= end; i++) {
            int [] arr = createArrayFromNumber(i);
            int sum = 0;
            int countOfNumbers = findQuantityCountAndIndex(i)[0];
            for (int j = 0; j < arr.length; j++) {
                sum = sum+(int) Math.pow(arr[j],countOfNumbers);
            }
            if(i == sum){
                list[count] = i;
                count++;
            }
        }

        int[]result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = list[i];
        }
        return result;
    }

    public static int[] createArrayFromNumber(int n){
        int arrayWitCountAndIndex[] = findQuantityCountAndIndex(n);
        int count = arrayWitCountAndIndex[0];
        int index = arrayWitCountAndIndex[1]/10;
        int [] result = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 1; j <=10 ; j++) {
                if(index*j>n){
                    result[i] = j-1;
                    break;
                }
            }
            n = n - result[i]*index;
            index = index/10;
        }
        return result;
    }

    public static int[] findQuantityCountAndIndex(int val){
        int index = 10;
        int count = 1;
        int []result = new int[2];
        while (val/index>=1){
            index = index*10;
            count++;

        }
        result[0] = count;
        result[1] = index;
        return result;
    }

    public static void toStringArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
            if(i != arr.length-1){
                System.out.print(", ");
            }
        }
    }
}
