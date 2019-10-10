/*
 * 2.Algorithmization
 * Task 9
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int x,y,z,t;
        System.out.println("Программа находит площадь " +
                "четырехугольника со сторонами X,Y,Z,T, " +
                "если угол между сторонами длиной X и Y — прямой");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число x ");
            x = scanner.nextInt();
            System.out.println("Введите число y ");
            y = scanner.nextInt();
            System.out.println("Введите число z ");
            z = scanner.nextInt();
            System.out.println("Введите число t ");
            t = scanner.nextInt();
        }
        System.out.println("Результат "+squareOfQuadrangle(x,y,z,t));
    }

    public static double squareOfQuadrangle(int x, int y,
                                            int z, int t){
        double square1 = squareOfRightTriangle(x,y);
        double c = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double square2 = squareOfSimpleTriangle(z,t,c);
        double result = square1 + square2;
        return result;
    }

    public static double squareOfSimpleTriangle(double a, double b, double c){
        double p = (a+b+c)/2;
        double result = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
    }

    public static double squareOfRightTriangle(double a, double b){
        double result = a*b/2;
        return result;
    }

}
