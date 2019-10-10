/*
 * 2.Algorithmization
 * Task 17
 * Из заданного числа вычли сумму его цифр.
 * Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int val;
        System.out.println("Программа из заданного числа " +
                "вычитает сумму его цифр и считает " +
                "сколько таких действий надо произвести, " +
                "чтобы получился нуль");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число ");
            val = scanner.nextInt();
        }
        System.out.println("Результат : "+counter(val)+" раз.");
    }

    public static int counter(int val){
        int count = 0;
        int num = val;
        while (num != 0) {
            int arr[] = createArrayFromNumber(num);
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            num = num - sum;
            count++;
        }
        return count;
    }

    public static int[] createArrayFromNumber(int n){
        int count = 1;
        int index = 10;
        while (n/index>=1){
            index = index*10;
            count++;
        }
        index = index/10;
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
}
