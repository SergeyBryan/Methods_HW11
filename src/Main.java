public class Main {
    public static void main(String[] args) {
//      Для задания 1
        int year = 2014;
        checkYear(year);
//      Для задания 2
        int clientDeviceYear = 2022;
        String osName = "Android";
        String clientOS = checkPhone(osName, clientDeviceYear);
        System.out.println(clientOS);
//      Для задания 3
        int deliveryDistance = 95;
        int deliveryDays = deliveryStatus(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    // Задание 1
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    // Задание 2
    public static String checkPhone(String name, int year) {
        if (name.equals("iOS") && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (name.equals("iOS") && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (!name.equals("iOS") && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!name.equals("iOS") && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        return "";
    }
    // Задание 3
    public static int deliveryStatus(int deliveryDistance) {
        int i = 1;
        if (deliveryDistance > 20) {
            i++;
        }
        if (deliveryDistance > 60) {
            i++;
        }
        if (deliveryDistance > 100) {
            i++;
        }
        if (deliveryDistance > 140) {
            i++;
        }
        return i;
    }
}