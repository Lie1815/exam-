package java_base;
import java.util.Scanner;

public class Discounts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("введите цену товара: ");
        double price = sc.nextDouble();

        System.out.println("Введите промокод: ");
        int promocode = sc.nextInt();

        double discont = 0;

        if (promocode == 4525){
            discont = 0.3;
        }else if(promocode == 6424|| promocode == 7012){
            discont = 0.2;
        }else if (promocode == 7647 || promocode == 9011 || promocode == 6612){
            discont = 0.1;
        }
        double finalPrice = price - (price * discont);
        System.out.println("цена с учетом скидки: " + finalPrice);
    }

}
