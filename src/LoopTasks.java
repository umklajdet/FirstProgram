import java.util.Arrays;
import java.util.Scanner;

public class LoopTasks {
    public static void main(String[] args) {
        Scanner scMain = new Scanner(System.in);
        System.out.println("Введите 7, 8, 9, или 10 для перехода к соответствующей задаче");
        int taskNum = scMain.nextInt();
        switch (taskNum) {
            case 7:
                task7();
                break;
            case 8:
                task8();
                break;
            case 9:
                task9();
                break;
            case 10:
                task10();
                break;
            default:
                System.out.println("Введен некорректный номер задачи");
        }
    }

    static void task7() {
        /*
        задача 7
        Напишите программу:
        Пользователь вводит размер массива и данные с клавиатуры в массив
        Сравнить элементы массива с заранее заданными константами x, y, z.
        Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        */
        System.out.println("задача 7");
        final int X = 10, Y = 15, Z = 100;
        System.out.println("Введите размер массива");
        Scanner sc7 = new Scanner(System.in);
        int size = sc7.nextInt();
        int[] arrTask7 = new int[size];
        System.out.println("Введите числа для заполнения массива");
        // ввод чисел в массив
        for (int i = 0; i < size; i++){
            arrTask7[i] = sc7.nextInt();
        }
        // сравнение содержимого массива с константами
        for (int n : arrTask7) {
            if(n == X | n == Y | n == Z)
                System.out.printf("Данное значение (%d) имеется в константах %n", n);
        }
    }

    static void task8() {
        //задача 8
        //Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        System.out.println("Задача 8");
        System.out.println("Введите положительное число");
        Scanner sc8 = new Scanner(System.in);
        int num = sc8.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i += 2){
            sum += i;
        }
        System.out.println("Сумма нечетных чисел = " + sum);
    }

    static void task9() {
        /*
        задача 9
        Напишите программу:
        Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        Посчитайте среднее арифметическое элементов массива.
        После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        */
        System.out.println("Задача 9");
        System.out.println("Введите размер массива");
        Scanner sc9 = new Scanner(System.in);
        int arrSize = sc9.nextInt();
        double[] arrTask9 = new double[arrSize];
        System.out.println("Введите числа для заполнения массива");
        // ввод чисел в массив
        for (int j = 0; j < arrTask9.length; j++){
            arrTask9[j] = sc9.nextDouble();
        }
        // подсчет ср. арифм.
        double avg = 0;
        for (double v : arrTask9) {
            avg += v;
        }
        avg = avg / arrTask9.length;
        //System.out.println(avg);
        // вывод произведения элементов массива и ср.арифм.
        for (double w : arrTask9){
            System.out.printf("Произведение элемента массива и среднего арифметического = %f%n", w*avg);
        }
    }

    static void task10() {
        // задача 10
        // Напишите программу, где пользователь вводит данные с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
        // Размерность матрицы задается пользователем.
        System.out.println("Задача 10");
        System.out.println("Введите количество строк и столбцов для создания массива");
        Scanner sc10 = new Scanner(System.in);
        // получаем размерность матрицы
        int str = sc10.nextInt();
        int col = sc10.nextInt();
        int[][] arrTask10 = new int[str][col];
        System.out.println("Введите числа для заполнения матрицы");
        // ввод чисел в матрицу
        for (int i = 0; i < str; i++){
            for (int j = 0; j < col; j++){
                arrTask10[i][j] = sc10.nextInt();
            }
        }
        //вывод первой строки матрицы с умножением на 3
        for (int j = 0; j < col; j++){
            System.out.printf("Элемент первой строки * 3 = %d%n", arrTask10[0][j]*3);
        }
    }
}