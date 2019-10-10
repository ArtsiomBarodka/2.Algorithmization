/*
 * 2.Algorithmization
 * Task 8
 * Даны дроби: p1/q1,p2/q2,...,pn/qn - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n;
        System.out.println("Программа дроби: " +
                "p1/q1,p2/q2,...,pn/qn приводит к общему знаменателю " +
                "и упорядочивает их в порядке возрастания.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите n");
            n = scanner.nextInt();
        }
        int []array1 = generateRandomPositiveArray(n);
        int []array2 = generateRandomPositiveArray(n);
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i]+"/"+array2[i] + ", ");
        }
        int nokVal = array2[0];
        for (int i = 1; i < array2.length; i++) {
            nokVal = getLeastСommonMultiple(array2[i],nokVal);
        }
        for (int i = 0; i < array1.length; i++) {
            int val = nokVal/array2[i];
            array1[i] = array1[i]*val;
            array2[i] = nokVal;
        }
        for (int i = 0; i < array1.length-1;) {
            if(array1[i]<=array1[i+1]){
                i++;
            } else if(array1[i] > array1[i+1]){
                int val = array1[i];
                array1[i] = array1[i+1];
                array1[i+1] = val;
                if(i == 0){
                    i++;
                } else {
                    i--;
                }
            }
        }
        System.out.println("\nПосле сортировки:");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i]+"/"+array2[i] + ", ");
        }
    }

    public static int getLeastСommonMultiple(int val1, int val2){
        int result = 1;
        if(val1<val2){
            for (int i = 1; i < val1; i++) {
                for (int j = 1; j < val2; j++) {
                    if(val2*i == val1*j){
                        result = val1*j;
                        return result;
                    }
                }
            }
        } else {
            for (int i = 1; i < val2; i++) {
                for (int j = 1; j < val1; j++) {
                    if(val1*i == val2*j){
                        result = val2*j;
                        return result;
                    }
                }
            }
        }
        result =  val1*val2;
        return result;
    }

    public static int [] generateRandomPositiveArray(int length){
        int max = 10;
        int []result = new int[length];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max)+1;
        }
        return result;
    }
}
