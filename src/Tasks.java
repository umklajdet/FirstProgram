import com.sun.javafx.runtime.SystemProperties;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //задача 2
        //Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей произвольное дробное значение.
        //Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте  ей наибольшее возможное значение.
        double q = 131.45;
        byte w = 127;
        System.out.println("q = " + q + "\nw = " + w);

        /* задача 3
        Задайте массив из 5 любых целых чисел.
        Поменяйте местами первый и последний элемент в массиве.
        Вывести в консоль результат суммы первого и среднего элемента.
        Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
        */
        int[] arrayTask3 = new int[]{10, 78, 65, 33, 784};
        int change = arrayTask3[0];
        arrayTask3[0] = arrayTask3[arrayTask3.length-1];
        arrayTask3[arrayTask3.length-1] = change;
        int sum = arrayTask3[0] + arrayTask3[arrayTask3.length/2];
        System.out.println("Сумма первого и среднего элемента массива = " + sum);

        /* задача 4
        Ввести три числа с клавиатуры x, y, z
        Найти и вывести в консоль среднее арифметическое этих чисел.
        Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double avg = (x+y+z)/3;
        System.out.println("Среднее арифметическое = " + avg);
        double avg2 = Math.floor(avg/2);
        if (avg2 > 3)
            System.out.println("Программа работает корректно");

        /* задача 5
        Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        */
        System.out.print("Введите 2 числа и символ арифметической операции: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String str;
        double result = 0;
        str = sc.nextLine().trim();
        //System.out.println(a + " " + b + " " + str);
        switch (str) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        System.out.println("результат = " + result);
    }
}