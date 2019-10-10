/*
 * 2.Algorithmization
 * Task 4
 * Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String arrayString [];
        System.out.println("Даны действительные числа а1,а2,..., an. \n" +
                "Программа меняет местами найбольший и найменьший элементы.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите последовательность чисел через запятую.");
            arrayString = scanner.nextLine().split(",");
            System.out.println(Arrays.toString(arrayString));
        }
        double minElement = Double.parseDouble(arrayString[0]);
        double maxElement = Double.parseDouble(arrayString[1]);
        int minNumberOfElement = 0;
        int maxNumberOfElement = 1;
        for (int i = 0; i < arrayString.length; i++) {
            double element = Double.parseDouble(arrayString[i]);
            if (element < minElement ){
                minElement = element;
                minNumberOfElement = i;
            } else if (element > maxElement){
                maxElement = element;
                maxNumberOfElement = i;
            }
        }
        arrayString[minNumberOfElement] = String.valueOf(maxElement);
        arrayString[maxNumberOfElement] = String.valueOf(minElement);
        System.out.println(Arrays.toString(arrayString));
    }
}
