import java.util.Scanner;

/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов. Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
*/
public class LineDiffSymbolsSearch {
    public static void main(String[] args) {
        Scanner sc03n = new Scanner(System.in);
        Scanner sc03s = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int strNum = sc03n.nextInt();
        String[] strArray = new String[strNum];
        System.out.println("Введите строки");
        for(int i = 0; i < strNum; i++){
            System.out.printf("Строка %d: ", i+1);
            strArray[i] = sc03s.nextLine();
        }
        char ch;
        int sum;
        // массив diffNum будет содержать количество различных символов для кждой строки из массива strArray
        int[] diffNum = new int[strNum];
        // проходим по массиву строк
        for (int k = 0; k < strArray.length; k++) {
            // массив flags будет показывать проверялся ли уже текущий символ. Индекс элемента соответствуе индексу символа в строке
            int[] flags = new int[strArray[k].length()];
            // проходим по строке
            for (int i = 0; i < strArray[k].length(); i++){
                ch = strArray[k].charAt(i);
                // если символ уже проверялся, пропускаем его
                if(flags[i] == 1)
                    continue;
                for (int j = i+1; j < strArray[k].length(); j++){
                    // если такой символ уже есть, соответствующему элементу массива flags присваивается 1. на следующих итерация символ будет пропущен
                    if (ch == strArray[k].charAt(j))
                        flags[j] = 1;
                }
            }
            diffNum[k] = 0;
            // считаем количество нулей во flags (соответствует кол-ву различных символов в строке) и присваиваем соответствующему элементу массива diffNum
            for (int flg : flags)
                if (flg == 0)
                    diffNum[k]++;
        }
        // ищем максимальный элемент в массиве diffNum и выводим соответсвующий в массиве strArray
        int max = 0, indexOfMax = 0;
        for (int d = 0; d < diffNum.length; d++) {
            if(diffNum[d] > max){
                max = diffNum[d];
                indexOfMax = d;
            }
        }
        System.out.printf("Строка - %s, различных символов - %d", strArray[indexOfMax], diffNum[indexOfMax]);
    }
}
