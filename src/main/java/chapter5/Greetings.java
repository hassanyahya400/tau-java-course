package chapter5;

import java.util.Scanner;

public class Greetings {
    public static  void main(String args[]) {

        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }
}
