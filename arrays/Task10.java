/*
 * 2.Algorithmization
 * Task 10
 * Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 * Artsiom Barodka
 *
 */
package algorithmization.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа сжимает целочисленный массив с количеством" +
                "элементов n. \n" +
                "(Выбрасывает каждый второй элемент)");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите n ");
            n = scanner.nextInt();
        }
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = generateRandomPositiveNegativeValue();
        }
        System.out.println(Arrays.toString(array));
        for (int i = n-1; i >= 0 ; i--) {
            if(i%2 != 0){
                shiftArrayToOneElement(i,array);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int generateRandomPositiveNegativeValue(){
        int max = 200;
        int avr = 100;
        int result;
        Random random = new Random();
        result = random.nextInt(max + 1) - avr;
        return result;
    }

    public static void shiftArrayToOneElement(int j,int array[]){
        boolean marker = false;
        for (int i = 0; i < array.length; i++) {
            if (marker){
                array[i-1] = array[i];
                if(i == array.length - 1){
                    array[i] = 0;
                }
            } else if (i == j){
                marker = true;
                if(i == array.length-1){
                    array[i] = 0;
                }
            }
        }

    }
}
