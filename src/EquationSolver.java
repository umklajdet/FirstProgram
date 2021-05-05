import java.util.Scanner;
/*
Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.
Пример для теста работы программы:
Ввод: x+5=7
Вывод: 2
Ввод: 3-x=9
Вывод: -6
Ввод: 3-3=x
Вывод: 0
 */

public class EquationSolver {
    public static void main(String[] args) {
        int newEq = 1;
        while (newEq == 1) {
            System.out.println("Введите уравнение");
            Scanner sc02 = new Scanner(System.in);
            String equation = sc02.nextLine();
            int digit1 = 0, digit2 = 0, x = 0;
            int index = equation.indexOf('x');
            switch (index) {
                case 0:
                    digit1 = Character.getNumericValue(equation.charAt(2));
                    digit2 = Character.getNumericValue(equation.charAt(4));
                    break;
                case 2:
                    digit1 = Character.getNumericValue(equation.charAt(0));
                    digit2 = Character.getNumericValue(equation.charAt(4));
                    break;
                case 4:
                    digit1 = Character.getNumericValue(equation.charAt(0));
                    digit2 = Character.getNumericValue(equation.charAt(2));
                    break;
            }
            switch (equation.charAt(1)) {
                case '+':
                    if (index == 0 | index == 2)
                        x = digit2 - digit1;
                    if (index == 4)
                        x = digit2 + digit1;
                    break;
                case '-':
                    if (index == 0)
                        x = digit2 + digit1;
                    if (index == 2 | index == 4)
                        x = digit1 - digit2;
                    break;
                case '*':
                    if (index == 0 | index == 2)
                        x = digit2 / digit1;
                    if (index == 4)
                        x = digit2 * digit1;
                    break;
                case '/':
                    if (index == 0)
                        x = digit2 * digit1;
                    if (index == 2 | index == 4)
                        x = digit1 / digit2;
                    break;
                default:
                    System.out.println("Что-то не так");
            }
            System.out.printf("Решение: x = %d%n", x);
            System.out.println("Ввести новое уравнение? Введите 1 для ввода нового уравнения, 0 для завершения работы программы");
            newEq = sc02.nextInt();
        }
        System.out.println("Спасибо за использование нашей программы!");
    }
}
