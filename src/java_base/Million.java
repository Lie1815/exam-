package java_base;

import java.util.Scanner;

public class Million {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести начальный баланс: ");
        int balance = scanner.nextInt();
        int years;
        for (years = 0; balance< 1000000; years++) {
            balance = balance +(balance/10);
            System.out.println("через" +" " +  years +" "+ "лет" +" " + balance + " " + "рублей");
        }}
}
