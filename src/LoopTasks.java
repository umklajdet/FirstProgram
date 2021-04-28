import java.util.Scanner;
/*
задача 7
Напишите программу:
Пользователь вводит размер массива и данные с клавиатуры в массив
Сравнить элементы массива с заранее заданными константами x, y, z.
Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
*/
public class LoopTasks {
    public static void main(String[] args) {
        int x = 10, y = 15, z = 100;
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrTask7 = new int[size];
        System.out.println("Введите числа для заполнения массива");
        // ввод чисел в массив
        for (int i = 0; i < size; i++){
            arrTask7[i] = sc.nextInt();
        }
        // сравнение содержимого массива с константами
        for (int n : arrTask7) {
            if(n == x | n == y | n == z)
                System.out.printf("Данное значение (%d) имеется в константах %n", n);
        }
    }
}