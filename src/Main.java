public class Main {
    public static void main(String[] args) {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введено неверное значение");
        }

        byte clientOs = 0;
        int clietntDeviceYear = 2016;
        if (clientOs == 0 && clietntDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOs == 1 && clietntDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clietntDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int year = 2021;
        if ((year < 1584) && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(+year + "год являеться високостным");
        } else {
            System.out.println(+year + "год не являеться високостным");
        }

        int deliveryDistans = 95;
        int deliveryDay = 1;
        boolean day1 = deliveryDistans <= 20;
        boolean day2 = deliveryDistans >= 20 && deliveryDistans <= 60;
        boolean day3 = deliveryDistans >= 60 && deliveryDistans <= 100;
        if (day1) {
            deliveryDay = 1;
        } else if (day2) {
            deliveryDay = 2;
        } else if (day3) {
            deliveryDay = 3;
        }
        if (day1) {
            System.out.println("Потребуеться дней" + deliveryDay);
        } else if (day2) {
            System.out.println("Потребуеться дней" + deliveryDay);
        } else if (day3) {
            System.out.println("Потребуеться дней" + deliveryDay);
        } else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}