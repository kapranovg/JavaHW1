package Homework.HW1;

/*
 * Реализовать простой калькулятор
 */
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.printf("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
        System.out.printf("Введите операцию: ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println(firstNumber + secondNumber);
        }
        else if (operation == '-') {
            System.out.println(firstNumber - secondNumber);
        }
        else if (operation == '*') {
            System.out.println(firstNumber * secondNumber);
        }
        else if (operation == '/' && secondNumber != 0) {
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Деление на 0 невозможно!");
        }
    }
}
