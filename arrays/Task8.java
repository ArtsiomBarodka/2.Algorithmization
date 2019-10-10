/*
 * 2.Algorithmization
 * Task 8
 * Дана последовательность целых чисел a1,a2,...,an
 * Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min (a1,a2,...,an)
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String arrayString [];
        System.out.println("Даны целые числа a1,a2,...,an \n" +
                "Программа находит новую последовательность, " +
                "выбрасывая min (a1,a2,...,an)");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите последовательность целых чисел через запятую.");
            arrayString = scanner.nextLine().split(",");
        }
        int min = Integer.parseInt(arrayString[0]);
        int count = 0;
        int num;
        for (int i = 1; i < arrayString.length ; i++) {
            num = Integer.parseInt(arrayString[i]);
            if (num < min){
                min = num;
                count++;
            } else if(num > min && min != num) {
                count++;
            }
        }
        int [] result = new int[count];
        System.out.println(count);
        count = 0;
        for (int i = 0; i < arrayString.length; i++) {
            num = Integer.parseInt(arrayString[i]);
            if(num > min){
                result[count] = num;
                count++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
