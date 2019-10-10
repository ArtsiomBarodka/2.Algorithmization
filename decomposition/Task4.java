/*
 * 2.Algorithmization
 * Task 4
 * На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие,
 * между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n;
        double maxLength;
        System.out.println("Программа формирует координаты n точек." +
                "Определяет между какими парами самое большое расстояние.");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите количество точек n ");
            n = scanner.nextInt();
        }
        int [][]coordinates = generateRandomCoordinates(n);
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println(Arrays.toString(coordinates[i]));
        }
        int index1 = 0;
        int index2 = 0;
        maxLength = findLengthBetweenCoordinates(coordinates[index1][0],
                            coordinates[index1][1],
                            coordinates[index2][0],
                            coordinates[index2][1]);

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 1+i; j < coordinates.length; j++) {
                double val = findLengthBetweenCoordinates(coordinates[i][0],
                                coordinates[i][1],
                                coordinates[j][0],
                                coordinates[j][1]);
                if(maxLength < val){
                    maxLength = val;
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Наибольшее расстояние равное " + maxLength
        +" между точками с координатами: ("+coordinates[index1][0]+","+
                coordinates[index1][1]+ ") и ("+coordinates[index2][0]+
                ","+coordinates[index2][1]+")");
    }

    public static double findLengthBetweenCoordinates(int x1, int y1,
                                             int x2, int y2){
        double result = Math.sqrt(Math.pow((x1 - x2),2)+Math.pow((y2 - y1),2));
        return result;
    }

    public static int [][] generateRandomCoordinates(int n){
        int max = 10;
        int [][]result = new int[n][2];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i][0] = random.nextInt(max*2 + 1) - max;
            result[i][1] = random.nextInt(max*2 + 1) - max;
        }
        return result;
    }
}
