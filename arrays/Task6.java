/*
 * 2.Algorithmization
 * Task 6
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double array [];
        double result = 0;
        int n;
        System.out.println("Дана последовательность  N вещественных чисел. \n" +
                "Программа вычисляет сумму чисел, порядковые номера которых " +
                "являются простыми числами. ");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число N");
            while (!scanner.hasNextInt()){
                scanner.next();
            }
            n = scanner.nextInt();
        }
        array = new double[n];
        for (int i = 0; i < n ; i++) {
            array[i] = generateRandomPositiveNegativeValue();
            if(isSimpleNumber(i)){
                result = result + array[i];
            }
        }
        System.out.println(result);

    }

    public static double generateRandomPositiveNegativeValue(){
        double max = 50000;
        double min = 0;
        double avr = 25000;
        double result;
        Random random = new Random();
        result = random.nextDouble()*(max - min) - avr;
        return result;
    }

    public static boolean isSimpleNumber(int num){
        if(num == 2 ){
            return true;
        }
        if(num == 0 || num == 1){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
