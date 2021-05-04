import java.text.DecimalFormat;
import java.util.Scanner;

/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
Пример для теста работы программы:
Курс доллара: 67,55
Количество рублей: 1000
Итого: 14,80 долларов
 */

public class UsdConverter {
    public static void main(String[] args) {
        double rate, usd, rur;
        System.out.println("Курс доллара: ");
        Scanner sc01 = new Scanner(System.in);
        rate = sc01.nextDouble();
        System.out.println("Количество рублей: ");
        rur = sc01.nextDouble();
        usd = rur / rate;
        System.out.println("Долларов: " + usd + ". Округляем...");
        System.out.println("способ 1");
        System.out.printf("Итого: %.2f долларов %n", usd);
        System.out.println("способ 2");
        System.out.println("Итого: " + (double) Math.round(usd * 100) / 100.00 + " долларов");
        System.out.println("способ 3");
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("Итого %s долларов", df.format(usd));
    }
}
