import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte b = 20;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 200;
        System.out.println("Значение переменной s с типом short равно " + s);
        int i = 500;
        System.out.println("Значение переменной i с типом int равно " + i);
        long l = 1000L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 1f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 5.75f;
        System.out.println("Значение переменной d с типом double равно " + d);

    }

    public static void task2 () {
        System.out.println("Задача 2");
        float flo = 27.12f;
        long lon = 987678965549L;
        double dou = 2.786;
        short sho = 569;
        int minus = -159;
        int in = 27897;
        byte by = 67;

    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short amountPaper = 480;
        int oneStudent = amountPaper / (lyudmila + anna + ekaterina);
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");

    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte minute = 2;
        int bottleInMinute = bottle / minute;
        int twenteen = bottleInMinute * 20;
        System.out.println("За 20 минут, машина произвела " + twenteen + " штук бутылок");
        int hour = twenteen * 3;
        int oneDay = hour * 24;
        System.out.println("За сутки, машина произвела " + oneDay + " штук бутылок");
        int threeDay = oneDay * 3;
        System.out.println("За 3 дня, машина произвела " + threeDay + " штук бутылок");
        int oneMonth = threeDay * 10;
        System.out.println("За 1 месяц, машина произвела " + oneMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte all = 120;
        int whiteCans = 2;
        int brownCans = 4;
        int amountClass = 120 / (whiteCans + brownCans);
        int white = amountClass * whiteCans;
        int brown = amountClass * brownCans;
        System.out.println("В школе, где " + amountClass + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeightGramm = bananas + milk + iceCream + eggs;
        System.out.println("Вес спортзавтрака в граммах равен " + totalWeightGramm + " грамм");
        float totalWeightKilogramm = totalWeightGramm / 1000f;
        System.out.println("Вес спортзавтрака в килограммах равен " + totalWeightKilogramm + " килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int weight = 7000;
        int min = 250;
        double minDay = weight / min;
        System.out.println(minDay + " дней потребуется на похудение, если терять по 250 г каждый день");
        int max = 500;
        double maxDay = weight / max;
        System.out.println(maxDay + " дней потребуется на похудение, если терять по 500 г каждый день");
        double middleDay = (min + max) / 2;
        double end = weight / middleDay;
        System.out.printf(Locale.US, "Среднее кол-во дней %.2f%n", end);
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mary = 67760;
        int maryUp = mary + (mary / 100 * 10);
        int maryOldYear = mary * 12;
        int maryNewYear = maryUp * 12;
        int maryDifferenceYear = maryNewYear - maryOldYear;
        System.out.println("Маша теперь получает " + maryUp + " рублей в месяц. " + "Годовой доход вырос на " + maryDifferenceYear + " рублей");
        int denis = 83690;
        int denisUp = denis + (denis / 100 * 10);
        int denisOldYear = denis * 12;
        int denisNewYear = denisUp * 12;
        int denisDifferenceYear = denisNewYear - denisOldYear;
        System.out.println("Денис теперь получает " + denisUp + " рублей в месяц. " + "Годовой доход вырос на " + denisDifferenceYear + " рублей");
        int kristina = 76230;
        int kristinaUp = kristina + (kristina / 100 * 10);
        int kristinaOldYear = kristina * 12;
        int kristinaNewYear = kristinaUp * 12;
        int kristinaDifferenceYear = kristinaNewYear - kristinaOldYear;
        System.out.println("Кристина теперь получает " + kristinaUp + " рублей в месяц. " + "Годовой доход вырос на " + kristinaDifferenceYear + " рублей");
    }
}
