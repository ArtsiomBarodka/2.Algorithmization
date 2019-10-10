/*
 * 2.Algorithmization
 * Task 3
 * Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площадитреугольника.
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a;
        System.out.println("Программа находит площадь правильного " +
                "шестиугольника со стороной А, используя метод" +
                "нахождения вычисления площади треугольника.");
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите длинну стороны шестиугольника A");
            a = scanner.nextInt();
        }
        System.out.println("Площадь равна = " + squareOfEquilateralHexagon(a));
    }

    public static double squareOfEquilateralTriangle(int a){
        double result =  (Math.sqrt(3)*Math.pow(a,2))/4;
        return result;
    }

    public static double squareOfEquilateralHexagon(int a){
        double tr = squareOfEquilateralTriangle(a);
        return 6*tr;
    }

}
