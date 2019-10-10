/*
 * 2.Algorithmization
 * Task 6
 * Написать метод(методы), проверяющий,
 * являются ли данные три числа взаимно простыми.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Программа проверяет являются ли " +
                " числа a,b,c взаимно простыми");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число a ");
            a = scanner.nextInt();
            System.out.println("Введите число b ");
            b = scanner.nextInt();
            System.out.println("Введите число c ");
            c = scanner.nextInt();
        }
        if(isSimpleNumbers(a,b,c)){
            System.out.println("Да, являются.");
        } else {
            System.out.println("Нет, не являются.");
        }
    }

    public static boolean isSimpleNumbers(int...arr){
        int minVal = arr[0] ;
        boolean result = true;
        for (int i = 1; i < arr.length; i++) {
            if(minVal > arr[i]){
                minVal = arr[i];
            }
        }
        for (int i = 2; i <= minVal;i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]%i !=0){
                    break;
                }
                if(j == arr.length-1){
                    result = false;
                }
            }
        }
        return result;
    }
}


