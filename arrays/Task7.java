/*
 * 2.Algorithmization
 * Task 7
 * Даны действительные числа: a1,a2,...,a2n
 * Найти: max (a1+a2n, a2+a2n-1, ... , an+an+1)
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        boolean isRightNumber = false;
        int n;
        double max;
        String arrayString [] = new String[0];
        System.out.println("Даны действительные числа a1,a2,...,a2n \n" +
                "Программа находит max (a1+a2n, a2+a2n-1, ... , an+an+1)");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите n");
            n = scanner.nextInt();
            while (!isRightNumber){
                System.out.println("Введите "+2*n +" действительных чисел через запятую.");
                arrayString = scanner.nextLine().split(",");
                isRightNumber = (2*n == arrayString.length);
            }
        }
        System.out.println(arrayString.length);
        max = Double.parseDouble(arrayString[0])+
                Double.parseDouble(arrayString[2*n-1]);
        for (int i = 1; i < n; i++) {
            double num = Double.parseDouble(arrayString[i])+
                    Double.parseDouble(arrayString[2*n - (i+1)]);
            if(num >max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
