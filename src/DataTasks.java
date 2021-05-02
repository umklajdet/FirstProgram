import java.util.Scanner;

public class dataTasks {
    public static void main(String[] args){
        /* задача 11
        Напишите программу:
        Ввести первое  число с клавиатуры и записать его в строковую переменную.
        Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        Сравнить 2 числа и вывести большее на экран .
        Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
         */
        System.out.println("Введите 2 числа");
        Scanner sc11 = new Scanner(System.in);
        String num1 = sc11.nextLine();
        int num2 = sc11.nextInt();
        if(Integer.parseInt(num1) > num2){
            System.out.println(num1);
            System.out.println((double) num2);
        }
        if(num2 > Integer.parseInt(num1)){
            System.out.println(num2);
            System.out.println((double) Integer.parseInt(num1));
        }
    }
}
