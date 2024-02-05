package java_base;
import java.util.Scanner;

public class Washing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите кол-во тарелок: ");
        int plate = sc.nextInt();
        System.out.println("Введите кол-во моющего средства: ");
        double cleanser = sc.nextDouble();

        for (int i = 1; i <= plate; i++) {
            cleanser -= 0.5;
            if (cleanser >= 0) {
                System.out.println("После помывки тарелки " + i + " осталось средства: " + cleanser);
            } else {
                System.out.println("средства не хватает");
                break;
            }
        }
    }
}

