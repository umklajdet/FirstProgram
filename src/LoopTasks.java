import java.util.Scanner;

public class LoopTasks {
    public static void main(String[] args) {
        /*
        задача 7
        Напишите программу:
        Пользователь вводит размер массива и данные с клавиатуры в массив
        Сравнить элементы массива с заранее заданными константами x, y, z.
        Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        */
        System.out.println("задача 7");
        int x = 10, y = 15, z = 100;
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
            if(n == x | n == y | n == z)
                System.out.printf("Данное значение (%d) имеется в константах %n", n);
        }

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
        // ввод чисел в массив
        for (int j = 0; j < arrTask9.length; j++){
            arrTask9[j] = sc7.nextDouble();
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
}