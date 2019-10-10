/*
 * 2.Algorithmization
 * Task 11
 * Написать метод(методы), определяющий,
 * в каком из данных двух чисел больше цифр.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Программа определяет в каком" +
                " из данных двух чисел A и B больше цифр");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число A ");
            a = scanner.nextInt();
            System.out.println("Введите число B ");
            b = scanner.nextInt();
        }
        int result = findTheMostQuantityNumbersOfVal(a,b);
        if(result == -1){
            System.out.println("В обоих числах число цифр одинаково.");
        } else {
            System.out.println("Больше цифр в числе "+ result);
        }
    }

    public static int findTheMostQuantityNumbersOfVal(int firstVal,
                                                 int secondVal){
        int firstIndex = findQuantityIndex(firstVal);
        int secondIndex = findQuantityIndex(secondVal);
        if(firstIndex == secondIndex){
            return -1;
        }
        int result = firstIndex > secondIndex ? firstVal : secondVal;
        return result;
    }

    public static int findQuantityIndex(int val){
        int count = 10;
        int result = 1;
        while (val/count>=1){
            count = count*10;
            result++;
        }
        return result;
    }
}
