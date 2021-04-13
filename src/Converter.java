import java.util.Scanner;

/* задача 6
1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
 */

public class Converter {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value == 1)
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - фунт, 3 - унция, 4 - стоун");
        else if (value == 2)
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        else {
            System.out.println("Введено неверное значение");
            return;
        }
        int measure = sc.nextInt();
        if (measure != 1 & measure != 2 & measure != 3 & measure != 4){
            System.out.println("Введено неверное значение");
            return;
        }
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        // множители для конвертации расстояния
        double m2ml = 1609;
        double m2yrd = 1.094;
        double m2ft = 3.281;
        double ml2yrd = 1760;
        double ml2ft = 5280;
        double yrd2ft = 3;
        // результирующие значения расстояния
        double mRes = 0;
        double mlRes = 0;
        double yrdRes = 0;
        double ftRes = 0;
        // множители для конвертации массы
        double g2pn = 454;
        double g2oz = 28.35;
        double g2st = 6350.29;
        double pn2oz = 16;
        double pn2st = 14;
        double oz2st = 224;
        // результирующие значения массы
        double gRes = 0;
        double pnRes = 0;
        double ozRes = 0;
        double stRes = 0;

        // вычисление результирующих значений расстояния
        if (value == 2){
            switch (measure){
                case 1:
                    mRes = num;
                    mlRes = num / m2ml;
                    yrdRes = num * m2yrd;
                    ftRes = num * m2ft;
                    break;
                case 2:
                    mlRes = num;
                    mRes = num * m2ml;
                    yrdRes = num * ml2yrd;
                    ftRes = num * ml2ft;
                    break;
                case 3:
                    yrdRes = num;
                    mRes = num / m2yrd;
                    mlRes = num / ml2yrd;
                    ftRes = num * yrd2ft;
                    break;
                case 4:
                    ftRes = num;
                    mRes = num / m2ft;
                    mlRes = num / ml2ft;
                    yrdRes = num / yrd2ft;
                    break;
            }
            //System.out.println("Результат:\n" + "Метры: " + mRes + "\nМили: " + mlRes + "\nЯрды: " + yrdRes + "\nФуты: " + ftRes);
            System.out.printf("Результат:%n" + "Метры: %f%n" + "Мили: %f%n" + "Ярды: %f%n" + "Футы: %f%n", mRes, mlRes, yrdRes, ftRes);
        }

        // здесь будет вычисление результирующих значений массы
        if (value == 1){
            switch (measure){
                case 1:
                    gRes = num;
                    pnRes = num / g2pn;
                    ozRes = num / g2oz;
                    stRes = num / g2st;
                    break;
                case 2:
                    pnRes = num;
                    gRes = num * g2pn;
                    ozRes = num * pn2oz;
                    stRes = num / pn2st;
                    break;
                case 3:
                    ozRes = num;
                    gRes = num * g2oz;
                    pnRes = num / pn2oz;
                    stRes = num / oz2st;
                    break;
                case 4:
                    stRes = num;
                    gRes = num * g2st;
                    pnRes = num * pn2st;
                    ozRes = num * oz2st;
                    break;
            }
            System.out.printf("Результат:%n" + "Граммы: %f%n" + "Фунты: %f%n" + "Унции: %f%n" + "Стоуны: %f%n", gRes, pnRes, ozRes, stRes);
        }
    }
}
