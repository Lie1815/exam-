package java_base;

import java.util.Random;
import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretNum = random.nextInt(10);
        int attempt = 3;
        System.out.println("Компьютер загадал число от 1 до 9. У вас есть 3 попытки.");
        while (attempt > 0){
            System.out.println("введите число: ");
            int Number = sc.nextInt();
            if (Number == secretNum){
                System.out.println("Вы угадали число!");
                break;
            } else if (Number < secretNum){
                System.out.println("загадачное число больше");
            } else {
                System.out.println("загадочное число меньше");
            } attempt --;
        }
        if (attempt == 0){
            System.out.println("у вас закончились попытки. Загаданное число было: " + secretNum);
        }
    }
}
