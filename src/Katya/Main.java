package Katya;

import java.util.Scanner;

/**
 * Created by katechebonenko on 12/4/16.
 */

public class Main {
    public static void main(String[] args) {

        String login = "a";
        String pass = "1";

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter login");

        String enterLogin = scanner.nextLine();

        System.out.println("enter pass");

        String enterPass = scanner.nextLine();

        boolean loginCompare = login.equals(enterLogin);

        boolean passCompare = pass.equals(enterPass);

        if (loginCompare && passCompare)

            System.out.println ("Succes");

        else
            System.out.println ("False");



    }
}

