/*
 * 2.Algorithmization
 * Task 2
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int arrayInt[];
        int z;
        int countOperation = 0;
        String arrayString[];
        System.out.println("Дана последовательность всех чисел a1,a2,..an.\n" +
                "Программа заменяет все ее члены, большие введенного Zб этим числом, " +
                "также подсчитает количество замен.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите последовательность чисел через запятую.");
            arrayString = scanner.nextLine().split(",");
            System.out.println("Введите число Z");
            z = scanner.nextInt();
            System.out.println(Arrays.toString(arrayString));
        }
        arrayInt = new int[arrayString.length];
        for (int i = 0; i <arrayString.length ; i++) {
            if(Integer.parseInt(arrayString[i]) > z){
                countOperation++;
                arrayInt[i] = z;
            } else {
                arrayInt[i] = Integer.parseInt(arrayString[i]);
            }
        }
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Количество замен = "+countOperation);
    }
}
