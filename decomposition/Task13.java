/*
 * 2.Algorithmization
 * Task 13
 * Два простых числа называются «близнецами»,
 * если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Программа находит се пары " +
                "«близнецов» из отрезка [n,2n].");
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число n ");
            n = scanner.nextInt();
        }
        int [][]result = createPairsOfNumbers(n,2*n);
        System.out.println("Результат: ");
        toStringArrayOfArrays(result);
    }

    public static int [][] createPairsOfNumbers(int start, int end){
        int length = (end - start)+1;
        int [][]list  = new int[length][2];
        int [][]result;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if(isSimpleNumber(i)&& i+2 <= end ){
                if(isSimpleNumber(i+2)){
                    list[count][0]= i;
                    list[count][1] = i+2;
                    count++;
                }
            }
        }
        result = new int[count][2];
        for (int i = 0; i < count ; i++) {
            result[i][0] = list[i][0];
            result[i][1] = list[i][1];
        }
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

    public static void toStringArrayOfArrays(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == arr[i].length-1){
                    System.out.print("["+arr[i][j]+"]\n");
                } else {
                    System.out.print("[" + arr[i][j] + "],");
                }
            }
        }
    }
}
