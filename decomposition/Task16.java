/*
 * 2.Algorithmization
 * Task 16
 * Написать программу, определяющую сумму n - значных чисел,
 * содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа выводит сумму n - значных чисел," +
                " содержащих только нечетные цифры. Также " +
                "определяет, сколько четных цифр в найденной сумме.");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число n ");
            n = scanner.nextInt();
        }
        long result = findSumNumbersOfValue(n);
        System.out.println("Сумма равна : "+result);
        System.out.println("число содержит "+ countUnevenNumbersOfValue(result)+" четных цифр.");
    }

    public static long findSumNumbersOfValue(int index){
        int count = 1;
        long result = 0l;
        for (int i = 0; i < index; i++) {
            count = count * 10;
        }
        int maxCount = count;
        count = count/10;
        for (int i = count; i < maxCount; i++) {
            int [] arrOfNum = createArrayFromNumber(i);
            for (int j = 0; j < arrOfNum.length; j++) {
                if(isEven(arrOfNum[j])){
                    break;
                }
                if(j == arrOfNum.length-1){
                    result = result + createNumberFromArray(arrOfNum);
                }
            }
        }
        return result;
    }

    public static long countUnevenNumbersOfValue(long val){
        int count = 0;
        int arr[] = createArrayFromNumber(val);
        for (int i = 0; i < arr.length; i++) {
            if(isEven(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean isEven(int num){
        if(num%2 == 0 || num == 0){
            return true;
        } else {
            return false;
        }
    }

    public static int[] createArrayFromNumber(long n){
        int count = 1;
        int index = 10;
        while (n/index>=1){
            index = index*10;
            count++;
        }
        index = index/10;
        int[]result = new int[count];
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

    public static int createNumberFromArray(int arr[]){
        int index = 1;
        int result = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            result = result + arr[i]*index;
            index = index*10;
        }
        return result;
    }
}
