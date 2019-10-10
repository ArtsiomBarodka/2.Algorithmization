/*
 * 2.Algorithmization
 * Task 7
 * Пусть даны две неубывающие последовательности действительных чисел :
 * a1<a2<a3<...<an и b1<b2<b3<...<bm
 * Требуется указать те места, на которые нужно вставлять
 * элементы последовательности в первую последовательность так,
 * чтобы новая последовательность оставалась возрастающей.
 * Artsiom Barodka
 *
 */
package algorithmization.sort;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Программа создает две последовательностей:\n" +
                "a1<a2<a3<...<an и b1<b2<b3<...<bm \n" +
                "и указывает те места, на которые нужно вставлять элементы " +
                "второй в первую, чтобы новая последовательность оставалась " +
                "возрастающей.");
        int array1[] = sortArrayForTask(generateRandomPositiveAndNegativeArray());
        int array2[] = sortArrayForTask(generateRandomPositiveAndNegativeArray());
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int result[] = new int[array2.length];
        int index;
        int lastKey = -1;
        boolean isOpenPhrase;
        for (int i = 0; i < array2.length; i++) {
            index = binarySearch(array1,array2[i],0,array1.length-1);
            result[i] = index;
        }
        for (int i = 0; i < result.length; i++) {
            isOpenPhrase = (lastKey == result[i]);
            if(result[i] == 0 && !isOpenPhrase){
                System.out.println("Перед число первой последовательности :" +
                        +array1[result[i]]+ " стоит число второй " +
                        "последовательности:");
                System.out.println(array2[i]);
            } else if(result[i] == 0 && isOpenPhrase){
                System.out.println(array2[i]);
            } else if(result[i] == array1.length && !isOpenPhrase){
                System.out.println("После числа первой последовательности :" +
                        +array1[result[i]-1]+ " стоит число второй " +
                        "последовательности:");
                System.out.println(array2[i]);
            } else if(result[i] == array1.length && isOpenPhrase){
                System.out.println(array2[i]);
            } else if(!isOpenPhrase){
                System.out.println("Между числами первой последовательности :" +
                        +array1[result[i]-1]+" и "+array1[result[i]]
                        + " стоит число второй последовательности:");
                System.out.println(array2[i]);
            } else if(isOpenPhrase){
                System.out.println(array2[i]);
            }
            lastKey = result[i];
        }

    }

    private static int binarySearch(int arr[],
                                    int element,
                                    int firstIndex,
                                    int lastIndex){
        int middleIndex;
        int result = 0;
        while (firstIndex <= lastIndex){
            middleIndex = (firstIndex + lastIndex)/2;
            if(arr[middleIndex] == element){
                return middleIndex+1;
            } else if(arr[middleIndex] < element){
                firstIndex = middleIndex+1;
            } else if(arr[middleIndex] > element){
                lastIndex = middleIndex-1;
            }
            result = arr[middleIndex] < element? middleIndex+1 : middleIndex;

        }
        return result;

    }

    public static int[] sortArrayForTask(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = 1 + i; j < arr.length; j++) {
                if(min > arr[j]){
                    int val = min;
                    min = arr[j];
                    arr[j] = val;
                }
            }
            arr[i] = min;
        }
        return arr;
    }

    public static int [] generateRandomPositiveAndNegativeArray(){
        int max = 100;
        int result [] = new int[10];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(max*2 + 1) - max;
        }
        return result;
    }
}
