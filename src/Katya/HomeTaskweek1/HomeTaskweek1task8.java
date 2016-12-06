package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task8 {
    public static void main(String[] args) {

        //task8 Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
        //тавляется, если сумма покупки превышает 1000 гривен. (седьмой сделали в классе)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Purchase price");
        int price = scanner.nextInt();

        if (price>1000)
        {
            double discount = price*0.1;

            System.out.println ("Discount " +discount);

            double new_price = price-discount;
            System.out.println ("New price " +new_price);
        }
        else
        {
            System.out.println ("Purchase price is less then 1000hrn");
        }


    }
}
