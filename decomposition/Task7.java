/*
 * 2.Algorithmization
 * Task 7
 * Написать метод(методы) для вычисления суммы
 * факториалов всех нечетных чисел от 1 до 9
 * Artsiom Barodka
 *
 */
package algorithmization.decomposition;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Метод выводит суммы факториалов как четных," +
                "так и нечетных чисел.");
        System.out.println("Сумма факториалов всех нечетных " +
                "чисел от 1 до 9 составляет "+sumOfFactorial(9,false));
    }

    public static int sumOfFactorial(int index, boolean isEven){
        int result = 0;
        int val;
        for (int i = 0; i < index; i++) {
            val = 1;
            for (int j = 1; j <= index-i; j++) {
                if(isEven){
                    if((index - i)%2 == 0){
                        val = val*j;
                    }
                } else {
                    if((index - i)%2 != 0){
                        val = val*j;
                    }
                }
            }
            val = val == 1? 0:val;
            result = result + val;
        }
        result = isEven? result : result + 1;
        return result;
    }
}
