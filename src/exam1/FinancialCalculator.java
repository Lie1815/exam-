package exam1;

import java.math.BigDecimal;
import java.util.Scanner;

public class FinancialCalculator {
    private static final int DAYS_IN_MONTH = 30;
    private static BigDecimal[] expenses = new BigDecimal[DAYS_IN_MONTH];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1 – Ввести расходы за определенный день");
            System.out.println("2 – Траты за месяц");
            System.out.println("3 – Самая большая сумма расхода за месяц");
            System.out.println("4 – Конвертер валюты");
            System.out.println("0 – Выход");
            System.out.print("Выберите пункт меню: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    enterExpenses(scanner);
                    break;
                case 2:
                    displayExpenses();
                    break;
                case 3:
                    displayMaxExpense();
                    break;
                case 4:
                    currencyConverter();
                    break;
                case 0:
                    System.out.println("до встречи!");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите существующий пункт меню.");
            }
        }
    }

    private static void enterExpenses(Scanner scanner) {
        System.out.println("Ввести расходы за определенный день");
        System.out.print("Введите день (от 1 до 30): ");
        int day = scanner.nextInt();
        if (day < 1 || day > DAYS_IN_MONTH) {
            System.out.println("ошибка: дата больше 30");
            return;
        }
        System.out.print("Введите сумму трат за текущий день: ");
        BigDecimal expense = scanner.nextBigDecimal();

        if (expenses[day - 1] != null) {
            System.out.print("За этот день уже есть запись. Хотите ли вы перезаписать сумму? (yes/no): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")) {
                expenses[day - 1] = expense;
                System.out.println("Сумма успешно перезаписана");
            }
        } else {
            expenses[day - 1] = expense;
            System.out.println("Сумма успешно записана");
        }
    }

    private static void displayExpenses() {
        System.out.println("Траты за месяц:");
        for (int i = 0; i < expenses.length; i++) {
            System.out.println((i + 1) + " день – " + (expenses[i] == null ? "0" : expenses[i]) + " руб");
        }
    }

    private static void displayMaxExpense() {
        BigDecimal maxExpense = BigDecimal.ZERO;
        int maxExpenseDay = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] != null && expenses[i].compareTo(maxExpense) > 0) {
                maxExpense = expenses[i];
                maxExpenseDay = i + 1;
            }
        }
        System.out.println("Самая большая сумма расхода за месяц: " + maxExpenseDay + " день – " + maxExpense + " руб");
    }

    private static void currencyConverter() {
        BigDecimal totalExpenses = BigDecimal.ZERO;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] != null) {
                totalExpenses = totalExpenses.add(expenses[i]);
            }
        }
        System.out.println("Траты за месяц: " + totalExpenses + " руб");

        BigDecimal rateEur = new BigDecimal("98.23"); // курс евро к рублю
        BigDecimal rateUsd = new BigDecimal("91.24"); // курс доллара к рублю
        BigDecimal rateCny = new BigDecimal("12.63"); // курс юаня к рублю

        BigDecimal amountEur = totalExpenses.divide(rateEur, 2, BigDecimal.ROUND_HALF_UP);
        BigDecimal amountUsd = totalExpenses.divide(rateUsd, 2, BigDecimal.ROUND_HALF_UP);
        BigDecimal amountCny = totalExpenses.divide(rateCny, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Траты за месяц в евро: " + amountEur);
        System.out.println("Траты за месяц в долларах:  " + amountUsd);
        System.out.println("траты за месяц в юанях: " + amountCny);
    }}
