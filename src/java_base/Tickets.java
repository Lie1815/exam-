package java_base;

import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначный номер билета: ");
        int ticketNUmber = scanner.nextInt();
        if (isLucky(ticketNUmber)) {
            System.out.println(" Счастливый билет");
        } else {
            System.out.println(" простой билет");
        }
    }
    public static boolean isLucky(int number) {
        if(number <100000 || number > 999999) {
            return false; //проверка на шестизначность
        }
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for(int i = 0; i < 6; i++){
            int digit = number / 10;
            if (i < 3) {
                sumFirstHalf += digit;
            }else {
                sumSecondHalf += digit;
            }
        }
        return (sumFirstHalf == sumSecondHalf) && (sumFirstHalf % 2 == 0) && (sumSecondHalf % 2 == 0);
    }
}



