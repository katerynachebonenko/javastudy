package Katya.HomeTaskweek1;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/5/16.
 */
public class HomeTaskweek1task6 {
    public static void main(String[] args) {
        //tasksix У вас есть скорость и растояние, за какое время вы приедете в пукт назначания

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Speed (km/h)");
        int speed = scanner.nextInt();
        System.out.println("Enter Distance (km)");
        int distance = scanner.nextInt();

        float time = distance/speed;

        System.out.println ("Time (h) " + time);
    }
}
