
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
        int money = 15_000;
        int month = 0;
        int total = 0;
        while (total < 2_459_000) {
            total = total + money;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();

        for (int number2 = 10; number2 >= 0; number2--) {
            System.out.println(number2);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int fertility = 17;
        int mortality = 8;
        int population = 12_000_000;
        int year = 0;
        int populationGrowth = fertility - mortality;
        while (year < 10) {
            population = population + populationGrowth * population / 1000;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int money = 15_000;
        int month = 0;
        int total = 0;
        int percent = 7 * money / 100;
        while (total < 2_000_000) {
            total = total + money + percent;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");

        int money = 15_000;
        int month = 0;
        int total = 0;
        int percent = 7 * money / 100;
        while (total < 2_000_000) {
            total = total + money + percent;
            month = month + 1;
            if (month %6 == 0)
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int money = 15_000;
        int month = 0;
        int total = 0;
        int percent = 7 * money / 100;
        while (month < 108){
            total = total + money + percent;
            month = month + 1;
            if (month %6 == 0)
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 7;
         while (friday <= 31){
             System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
             friday = friday + 7;
             }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int cometTime = 79;
        int presentTime = 2023;
        int before = presentTime - 200;
        int after = presentTime + 100;
        for (int i = before; i  <= after; i++) {
            if (i % cometTime == 0) {
                System.out.println(i);
            }
        }
    }

}
