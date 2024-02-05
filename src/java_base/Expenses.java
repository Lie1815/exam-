package java_base;

import java.util.Random;

public class Expenses {
    public static void main(String[] args) {
        int[] costs = new int[7];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            costs[i] = random.nextInt(1000);
            sum += costs[i];
        }
        System.out.println("Расходы за неделю:");
        for (int i = 0; i < 7; i++) {
            System.out.println("День " + (i+1) + ": " + costs[i]);
        }
        System.out.println("Сумма расходов за неделю: " + sum);
    }
}
