import java.util.Scanner;

public class DataTasks {
    public static void main(String[] args){
        /* задача 11
        Напишите программу:
        Ввести первое  число с клавиатуры и записать его в строковую переменную.
        Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        Сравнить 2 числа и вывести большее на экран .
        Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
         */
        System.out.println("Задача 11");
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

        /* задача 12
        Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
        Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
         */
        System.out.println("Задача 12");
        System.out.println("Введите строку");
        Scanner sc12 = new Scanner(System.in);
        //String str12 = "I like Java!!!";
        String str12 = sc12.nextLine();
        boolean con1 = str12.contains("Java");
        boolean con2 = str12.startsWith("I like");
        boolean con3 = str12.endsWith("!!!");
        if(con1 & con2 & con3)
            System.out.println(str12.toUpperCase());
        String rep = str12.replace("a", "o");
        System.out.println(rep.substring(7, 11));
    }
}
