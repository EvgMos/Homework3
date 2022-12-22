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


    public static void task1() {
        System.out.println("Задача 1");
        int a = 20151515;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 60;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 8555;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 15498456448485151l;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 3.84f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 1.87;
        System.out.println("Значение переменной f с типом double равно " + f);

    }

    public static void task2() {
        System.out.println("Задача 2");
        char a = 569;
        byte b = 67;
        short c = 27897;
        long d = 987678965549L;
        float e = 2.786f;
        double f = 27.12;
        int g = -159;

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte l = 23; // Людмила Павловна
        byte a = 27; // Анна Сергеевна
        byte e = 30; // Екатерина Андреевна
        int amountOfPaper = 480;
        int totalNumberOfStudents;
        int oneStudent;
        totalNumberOfStudents = l + a + e;
        oneStudent = amountOfPaper / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги.");

    }

    public static void task4() {
        System.out.println("Задача 4");
        int a = 16; //за 2 минуты
        int d = a / 2; //за 1 минуту
        int c = 60 * 24; //минут в сутках
        System.out.println("За 20 минут машина произвела " + d * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + d * c + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + d * c * 3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + d * c * 30 + " штук бутылок"); //В расчет взято 30 дней в месяце.
    }

    public static void task5() {
        System.out.println("Задача 5");
        int needForRepair = 120;
        int white = 2; //на один класс.
        int brown = 4; //на один класс.
        int classes;
        classes = needForRepair / (white + brown);
        System.out.println("В школе, где " + classes + " классов, нужно " + white * classes + " банок белой краски и " + brown * classes + " банок коричневой краски");

    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 5 * 80; //Бананы — 5 штук (1 банан — 80 грамм).
        int milk = 200 / 100 * 105; //Молоко — 200 мл (100 мл = 105 грамм).
        int iceCream = 2 * 100; //Мороженое-пломбир — 2 брикета по 100 грамм.
        int egg = 4 * 70; //Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        int gramm = banana + milk + iceCream + egg;
        float kg = gramm / 1000f;
        System.out.println("В завтраке спортсмена: " + gramm + " грамм или " + kg + " кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a = 250; // 250 грамм в день
        int b = 500; // 500 грамм в день
        int c = 7; // 7 кг надо скинуть
        double d = c * 1000;
        System.out.println("При " + a + " граммах надо " + d / a + " дней.");
        System.out.println("При " + b + " граммах надо " + d / b + " дней.");
        System.out.println("В среднем  надо " + d / ((a + b) / 2) + " дней.");
    }

    public static void task8() {
        System.out.println("Задача 8");
        double masha = 67760;
        double denis = 83690;
        double kristina = 76230;
        int year = 12;
        int increase = 10;
        double increaseMasha = masha + (masha / 100 * increase);
        double increaseDenis = denis + (denis / 100 * increase);
        double increaseKristina = kristina + (kristina / 100 * increase);

        System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой доход вырос на " + (increaseMasha - masha) * 12 + " рублей.");
        System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + (increaseDenis - denis) * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + increaseKristina + " рублей. Годовой доход вырос на " + (increaseKristina - kristina) * 12 + " рублей.");
    }

}