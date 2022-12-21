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
            System.out.println("Задание №1");
            byte age = 25;
            short priceIphone = 2000;
            int priceCar = 130000;
            long distance = 40076000;
            System.out.println("Значение переменной age с типом byte равно " + age);
            System.out.println("Значение переменной priceIphone с типом short равно " + priceIphone);
            System.out.println("Значение переменной priceCar с типом int равно " + priceCar);
            System.out.println("Значение переменной distance с типом long равно " + distance);
            System.out.println(" ");
        }
        public static void task2() {
            System.out.println("Задание №2");
            float varFloat = 27.12f;
            long varLong = 987678965549L;
            double varDouble = 2.786;
            short varShort1 = 569;
            short varShort2 = -159;
            int varInt = 27897;
            byte varByte = 67;
            System.out.println(" ");
        }
        public static void task3() {
            System.out.println("Задание №3");
            int classLP = 23;
            int classAS = 27;
            int classEA = 30;
            int totalPaper = 480;
            int studentPaper = totalPaper / (classAS+classEA+classLP);
            System.out.println("Каждый ученик получит " + studentPaper + " листов бумаги!");
            System.out.println(" ");
        }
        public static void task4() {
            System.out.println("Задание №4");
            int bottle = 16;
            int time = 2;
            int performance = bottle / time;
            int performanceTwentyMinutes = performance * 20;
            int performanceDay = performance * 60 * 24;
            int performanceThreeDays = performanceDay * 3;
            int performanceOneMonth = performanceDay * 30;
            System.out.println("За 20 минут машина произвела " + performanceTwentyMinutes + " штук бутылок");
            System.out.println("За сутки машина произвела " + performanceDay + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + performanceThreeDays + " штук бутылок");
            System.out.println("За месяц машина произвела " + performanceOneMonth + " штук бутылок");
            System.out.println(" ");
        }
        public static void task5() {
        System.out.println("Задание №5");
        int quantityColorWhite = 2;
        int quantityColorBrown = 4;
        int totalQuantityColors = 120;
        int totalQuantityClasses = totalQuantityColors/(quantityColorWhite + quantityColorBrown);
        int totalQuantityColorWhite = totalQuantityClasses * quantityColorWhite;
        int totalQuantityColorBrown = totalQuantityClasses * quantityColorBrown;
        System.out.println("В школе, где " + totalQuantityClasses + " классов, нужно " +
                totalQuantityColorWhite + " банок белой краски и " +
                totalQuantityColorBrown + " банок коричневой краски!");
        System.out.println(" ");
    }
        public static void task6() {
            System.out.println("Задание №6");
            int quantityBanana = 5;
            int weightBanana = 80;
            int quantityMilk = 2;
            int weightMilk = 105;
            int quantityIcecream = 2;
            int weightIcecream = 100;
            int quantityEggs = 4;
            int weightEgg = 70;
            int totalWeight = quantityBanana * weightBanana + quantityMilk * weightMilk +
                    quantityIcecream * weightIcecream + quantityEggs * weightEgg;
            System.out.println("Общий вес спортивного завтрака равен " + totalWeight + "грамм!");
            float totalWeightKillo = totalWeight / 1000f;
            System.out.println("Общий вес спортивного завтрака равен " + totalWeightKillo + " киллограмм!");
            System.out.println(" ");
        }
        public static void task7() {
            System.out.println("Задание №7");
            int totalWeight = 7;                                 // вес указан в киллограммах.
            int lostWeightDay1 = 250;                            // вес указан в граммах.
            int lostWeightDay2 = 500;                            // вес указан в граммах.
            int totalWeightKillo = totalWeight * 1000;           // переводим киллограммы в граммы.
            int totalDays1 = totalWeightKillo / lostWeightDay1;
            int totalDays2 = totalWeightKillo / lostWeightDay2;
            System.out.println("Если ежедневно худеть на " + lostWeightDay1 +
                    " грамм, то потребуется " + totalDays1 + " дней.");
            System.out.println("Если ежедневно худеть на " + lostWeightDay2 +
                    " грамм, то потребуется " + totalDays2 + " дней.");
            System.out.println(" ");
        }
        public static void task8() {
            System.out.println("Задание №8");
            int salaryMasha = 67760;
            int salaryDenis = 83690;
            int salaryKristina = 76230;
            int coefSalary = 10;
            int increaseSalaryMasha = salaryMasha * coefSalary / 100;           //на сколько увеличилась ежемесячная зп у Маши
            int increaseSalaryDenis = salaryDenis * coefSalary / 100;           //на сколько увеличилась ежемесячная зп у Дениса
            int increaseSalaryKristina = salaryKristina * coefSalary / 100;     //на сколько увеличилась ежемесячная зп у Кристины
            int totalIncreaseSalaryMasha = increaseSalaryMasha * 12;            //на сколько увеличилась годовая зп у Маши
            int totalIncreaseSalaryDenis = increaseSalaryDenis * 12;            //на сколько увеличилась годовая зп у Дениса
            int totalIncreaseSalaryKristina = increaseSalaryKristina * 12;      //на сколько увеличилась годовая зп у Кристины
            int resultSalaryMasha = salaryMasha + increaseSalaryMasha;           // новая ежемесячная зп Маши с учетом прибавки
            int resultSalaryDenis = increaseSalaryDenis + salaryDenis;           // новая ежемесячная зп Дениса с учетом прибавки
            int resultSalaryKristina = increaseSalaryKristina + salaryKristina;  // новая ежемесячная зп Кристины с учетом прибавки
            System.out.println("Маша теперь получает " + resultSalaryMasha +
                    " рублей. Годовой доход вырос на " + totalIncreaseSalaryMasha + " рублей");
            System.out.println("Денис теперь получает " + resultSalaryDenis +
                    " рублей. Годовой доход вырос на " +  totalIncreaseSalaryDenis + " рублей");
            System.out.println("Кристина теперь получает " + resultSalaryKristina +
                    " рублей. Годовой доход вырос на " + totalIncreaseSalaryKristina + " рублей");
        }



}