/*
 * 2.Algorithmization
 * Task 2
 * Написать метод(методы) для нахождения наибольшего общего
 * делителя четырех натуральных чисел.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Программа находит наибольший общий делитель" +
                "любого количества натуральных чисел," +
                "в данном задании четырех: a, b, с, d.");
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число А");
            a = scanner.nextInt();
            System.out.println("Введите число B");
            b = scanner.nextInt();
            System.out.println("Введите число C");
            c = scanner.nextInt();
            System.out.println("Введите число D");
            d = scanner.nextInt();
        }
        System.out.println("Наибольший общий делитель = "+
                +getGreatestCommonFactor(a,b,c,d));
    }
    public static int getGreatestCommonFactor(int...arr){
        int minVal = arr[0];
        int result = 1;
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
                    result = i;
                }
            }
        }
        return result;
    }
}
