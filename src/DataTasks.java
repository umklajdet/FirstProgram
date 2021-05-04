import java.util.Arrays;
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

        /* задача 13
        Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
        Выведите слова, состоящие только из латиницы.
        Выведите количество этих слов.
         */
        System.out.println("Задача 13");
        System.out.println("Введите строку");
        Scanner sc13 = new Scanner(System.in);
        String str13 = sc13.nextLine();
        String[] str13Arr = str13.split(" ");
        int latWordsNum = 0;
        //реализация1 (топорная))
        System.out.println("реализация1 топорная)");
        String[] latLetters = new String[]{"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        boolean containsNotLetter = false;
        //проходим по каждому слову в строке
        for(String word : str13Arr){
            //проверяем, содержит ли слово хотябы одну не-букву. если содержит, присваиваем переменной true и выход из цикла
            for(int k = 0; k < word.length(); k++){
                if(!Character.isLetter(word.charAt(k))){
                    containsNotLetter = true;
                    break;
                }
                else
                    containsNotLetter = false;
            }
            //если true - пропускаем проверку на соответствие симовалам латинского алфавита
            if (containsNotLetter)
                continue;
            //проверяем слово на соответствие симовалам латинского алфавита. если да - выводим слово и увеличиваем количество на 1
            for (String letter : latLetters){
                if(word.contains(letter) | word.toLowerCase().contains(letter)){
                    latWordsNum++;
                    System.out.println(word);
                    break;
                }
            }
        }
        System.out.println("Всего слов на латинице: "  + latWordsNum);
        //реализация2
        System.out.println("реализация2 (с регулярными выражениями)");
        latWordsNum = 0;
        for(String word : str13Arr){
            if(word.matches("^[a-zA-Z]+$")){
                latWordsNum++;
                System.out.println(word);
            }
        }
        System.out.printf("Всего слов на латинице: %d%n",  latWordsNum);

        /* задача 14
        Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        Выведите максимальный и минимальный элемент массива.
        Из максимального и минимального значения выведите наибольшее по модулю.
         */
        System.out.println("Задача 14");
        double[] randArr = new double[15];
        double max = -20;
        double min = 20;
        for (int i = 0; i < randArr.length; i++){
            randArr[i] = Math.random()*40-20;
            max = Math.max(randArr[i], max);
            min = Math.min(randArr[i], min);
        }
        /*for(double p : randArr)
            System.out.println(p);*/
        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);
        System.out.printf("Наибольшее по модулю = %f%n", Math.max(Math.abs(max), Math.abs(min)));
    }
}
