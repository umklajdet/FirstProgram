import com.sun.javafx.runtime.SystemProperties;

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
        */
        int[] arrayTask3 = new int[5];
        arrayTask3 = new int[]{10, 78, 65, 33, 784};
        int change = arrayTask3[0];
        arrayTask3[0] = arrayTask3[4];
        arrayTask3[4] = change;
        int sum = arrayTask3[0] + arrayTask3[2];
        System.out.println("Сумма первого и среднего элемента массива = " + sum);
    }
}