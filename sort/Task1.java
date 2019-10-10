/*
 * 2.Algorithmization
 * Task 1
 * Заданы два одномерных массива с различным количеством элементов
 * и натуральное число k. Объединить их в один массив,
 * включив второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String array1[];
        String array2[];
        int k;
        System.out.println("Программа объединяет 2 массива, включив второй" +
                " массив между k-м - (k+1)-м элементами первого.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите последовательность чисел" +
                    " первого массива через запятую.");
            array1 = scanner.nextLine().split(",");
            System.out.println("Введите последовательность чисел " +
                    "второго массива через запятую.");
            array2 = scanner.nextLine().split(",");
            while (true){
                System.out.println("Введите число k");
                k = scanner.nextInt();
                if(array1.length > k){
                    break;
                }
            }
        }
        String [] result = new String[array1.length+array2.length];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if(i < k){
                result[i] = array1[i];
            } else if( index < array2.length){
                result[i] = array2[index];
                index++;
            } else {
                result[i] = array1[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
