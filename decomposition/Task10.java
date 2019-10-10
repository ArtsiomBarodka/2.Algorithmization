/*
 * 2.Algorithmization
 * Task 10
 * Дано натуральное число N. Написать метод(методы) для
 * формирования массива, элементами которого являются цифры числа N.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа формирует массив," +
                " элементами которого являются цифры числа N");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число N ");
            n = scanner.nextInt();
        }
        System.out.println("Результат : "+Arrays.toString(createArrayFromNumber(n)));
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
