public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    public static void task1() {
        // Задача №1
        System.out.println("Задача №1");

        int clientOS = 1; // Клиент пользуется Android
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошибка");
        }
    }

    public static void task2() {
        // Задача №2
        System.out.println("Задача №2");

        int clientOS = 1; // Клиент пользуется Android
        int clientDeviceYear = 2015; // Клиент использует телефон 2015 года

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }


        }
    }

    public static void task3() {
        // Задача №3
        System.out.println("Задача №3");

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400== 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        // Задача №4
        System.out.println("Задача №4");
        int deliveryDistance = 95; // заданная дистанция
        int daysNumber = 1; // минимальное количество дней на доставку
        if (deliveryDistance <= 20) {
            daysNumber = daysNumber + 1;
            System.out.println("Потребуется дней: " + daysNumber);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysNumber = daysNumber + 2;
            System.out.println("Потребуется дней: " + daysNumber);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysNumber = daysNumber + 3;
            System.out.println("Потребуется дней: " + daysNumber);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        // Задача №5
        System.out.println("Задача №5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " принадлежит к сезону осень.");
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " принадлежит к сезону зима.");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}

