/*
 * 2.Algorithmization
 * Task 15
 * Найти все натуральные n-значные числа,
 * цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789).
 * Для решения задачи использовать декомпозицию.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа находит все натуральные " +
                "n-значные числа, цифры в которых " +
                "образуют строго возрастающую последовательность.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число n ");
            n = scanner.nextInt();
        }

        System.out.println("Результат : "+Arrays.toString(findIncreaseValueOfNumbers(n)));
    }

    public static int []findIncreaseValueOfNumbers(int index){
        int itemList = 0;
        int count = 1;
        for (int i = 0; i < index; i++) {
            count = count * 10;
        }
        int maxCount = count;
        count = count/10;
        int [] list = new int[(maxCount-count)];
        for (int i = count; i < maxCount; i++) {
            int []arrOfNum = createArrayFromNumber(i);
            for (int j = 1; j < arrOfNum.length; j++) {
                if(arrOfNum[j-1]+1 != arrOfNum[j]){
                    break;
                }
                if(j == arrOfNum.length-1){
                    list[itemList] = createNumberFromArray(arrOfNum);
                    itemList++;
                }
            }
        }
        int []result = new int[itemList];
        for (int i = 0; i < result.length; i++) {
            result[i] = list[i];
        }
        return result;
    }

    public static int createNumberFromArray(int arr[]){
        int index = 1;
        int result = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result = result + arr[i]*index;
            index = index*10;
        }
        return result;
    }

    public static int[] createArrayFromNumber(int n){
        int count = 1;
        int index = 10;
        while (n/index>=1){
            index = index*10;
            count++;
        }
        index = index/10;
        int [] result = new int[count];
        for (int i = 0; i < count; i++) {
            for (int j = 1; j <=10 ; j++) {
                if(index*j>n){
                    result[i] = j-1;
                    break;
                }
            }
            n = n - result[i]*index;
            index = index/10;
        }
        return result;
    }
}
