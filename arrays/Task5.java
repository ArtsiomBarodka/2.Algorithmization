/*
 * 2.Algorithmization
 * Task 5
 * Даны целые числа а1 ,а2 ,..., аn .
 * Вывести на печать только те числа, для которых аi > i.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String arrayString [];
        String result = "";
        System.out.println("Даны целые числа а1,а2,..., an. \n" +
                "Программа выводит на печать те числа, которые ai > i.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите последовательность чисел через запятую.");
            arrayString = scanner.nextLine().split(",");
            System.out.println(Arrays.toString(arrayString));
        }

        for (int i = 0; i < arrayString.length; i++) {
            int element = Integer.parseInt(arrayString[i]);
            if(element > i){
               result = result+arrayString[i]+", ";
            }
        }
        result = result.substring(0,result.length()-2);
        System.out.println(result);
    }
}
