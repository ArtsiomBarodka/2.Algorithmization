/*
 * 2.Algorithmization
 * Task 9
 * В массиве целых чисел с количеством элементов n найти
 * наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String arrayString[];
        int index = 0;
        int maxCount = 0;
        System.out.println("Программа находит в массиве целых чисел " +
                "наиболее часто встечающееся число. \n" +
                "Если таких чисел несколько, то наименьшее.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите последовательность целых чисел через запятую.");
            arrayString = scanner.nextLine().split(",");
        }
        for (int i = 0; i <arrayString.length ; i++) {
            int num1 = Integer.parseInt(arrayString[i]);
            int count = 0;
            for (int j = 0; j < arrayString.length; j++) {
                int num2 = Integer.parseInt(arrayString[j]);
                if(num1 == num2){
                    count++;
                }
                if(maxCount < count){
                    maxCount = count;
                    index = i;
                } else if(maxCount == count){
                    if(isSmaller(arrayString[i],arrayString[index])){
                        index = i;
                    }
                }
            }
        }
        System.out.println("Число "+ arrayString[index]+ " - " + maxCount + " раз.");
    }

    public static boolean isSmaller(String num1, String num2){
        return Integer.parseInt(num1) < Integer.parseInt(num2);
    }
}
