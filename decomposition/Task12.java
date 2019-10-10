/*
 * 2.Algorithmization
 * Task 12
 * Даны натуральные числа К и N. Написать метод(методы)
 * формирования массива А, элементами которого  являются числа,
 * сумма цифр которых равна К и которые не большее N.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int k;
        int n;
        System.out.println("Программа формирует массив с 10 элементами, " +
                "элементами которого являются числа, " +
                "сумма цифр которых равна К и которые не большее N.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число K ");
            k = scanner.nextInt();
            System.out.println("Введите число N ");
            n = scanner.nextInt();
        }
        int []result = generateRandomArray(k,n);
        System.out.println("Результат "+Arrays.toString(result));
    }

    public static int [] generateRandomArray(int sum, int max){
        int sumVal = 0;
        int []result = new int[10];
        double avr = (double) sum/result.length;
        Random random = new Random();
        if(avr > max){
            return result;
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max);
            sumVal = sumVal + result[i];
        }
        while (true){
            if(sumVal == sum){
                break;
            }
            int index1 = random.nextInt(result.length);
            sumVal = sumVal - result[index1];
            result[index1] = random.nextInt(max);
            sumVal = sumVal + result[index1];
        }

        return result;
    }
}
