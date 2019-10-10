/*
 * 2.Algorithmization
 * Task 1
 * Написать метод(методы) для нахождения наибольшего
 * общего делителя и наименьшего общего кратного двух натуральных чисел:
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Программа находит наибольший общий делитель " +
                "и наименьшее общее кратное двух натуральных чисел a и b.");
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число А");
            a = scanner.nextInt();
            System.out.println("Введите число B");
            b = scanner.nextInt();
        }
        System.out.println("Наибольший общий делитель = " + getGreatestCommonFactor(a,b));
        System.out.println("Наименьшее общее кратное = " + getLeastCommonMultiple(a,b));

    }

    public static int getLeastCommonMultiple(int x, int y){
        int result = x*y/ getGreatestCommonFactor(x,y);
        return result;
    }

    public static int getGreatestCommonFactor(int x, int y){
        int result = 1;
        if(x>y){
            for (int i = 2; i <= y; i++) {
                if(x%i==0 && y%i==0){
                    result = i;
                }
            }
        } else {
            for (int i = 2; i <= x; i++) {
                if(x%i==0 && y%i==0){
                    result = i;
                }
            }
        }
        return result;
    }
}
