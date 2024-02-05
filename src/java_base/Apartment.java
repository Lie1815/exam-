package java_base;

import java.util.Scanner;

public class Apartment {
    static int floors = 9;
    static int apartmentPerFloor = 4;
    static String position;
    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер квартиры:");
        int num = scan.nextInt();
        if(num>(floors*apartmentPerFloor) || num<=0) {
            System.out.println("Такой квартиры нет");
        } else {
            System.out.println("Квартира находится на " + ((int) Math.ceil((float) num/apartmentPerFloor)) + " этаже");
            switch (num%apartmentPerFloor){
                case 1:
                    System.out.println("Дальняя cлева");
                    break;
                case 2:
                    System.out.println("Слева от лифта");
                    break;
                case 3:
                    System.out.println("Справа от лифта");
                    break;
                case 0:
                    System.out.println("Дальняя cправа");
                    break;
            }
        }
    }
}

