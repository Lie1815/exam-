package java_base;

public class Packege {
    public static void main(String[] args) {
        for (int floor = 1; floor <= 10; floor++) {
            for (int apartment = 1; apartment <= 5; apartment++) {
                System.out.println("Доставка посылки в квартиру " + apartment + " на " + floor + " этаже");
            }
            System.out.println("Посылка доставлена");
        }
        System.out.println("Курьер завершил доставку по всем квартирам");
    }
}
