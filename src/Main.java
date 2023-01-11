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
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total < 2459000) {
            i = i + 1;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);

        }

    }

    public static void task2() {
        System.out.println("Задание 2");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println(" ");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");

        }
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println("Задание 3");
        int population = 12000000;
        int birthRate = 204000;//17/1000=12000000*17/1000=204000
        int deathRate = 96000;//8/1000=12000000*8/1000=96000
        int year = 0;
        while (year < 10) {
            year = year + 1;
            population = population + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + population);

        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total < 12000000) {
            i = i + 1;
            total = total + total * 7 / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);

        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (total < 12000000) {
            i = i + 1;
            total = total + total * 7 / 100;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }

        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int salary = 15000;
        int total = 0;
        int i = 0;

        while (i < 108) {// 9 years=108 months
            i = i + 1;
            total = total + total * 7 / 100;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int i = 2;
        while (i < 31) {

            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            i = i + 7;

        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        int currentYear = 2023;
        int beforeCurrentYear = 1823;//currentYear - 200;
        int afterCurrentYear = 2123; //currentYear +100;

        int i =1896;//первый год за последние 200 лет;
        while(i<2123){

         System.out.println(i);
           i=i+79;
            }


            }
        }

