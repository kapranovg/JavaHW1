package Homework.HW1;

/**
 * task1
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */
import java.util.Scanner;

 public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        
        int res = 0;
        int fact = 1;
        for (int i = 0; i < n + 1; i++) {
            res += i;
        }
        System.out.printf("n-ое треугольное число = %d \n", res);

        for (int i = 1; i < n + 1; i++) {
            fact *= i;
        }
        System.out.printf("Факториал n-го числа = %d", fact);
    }
}