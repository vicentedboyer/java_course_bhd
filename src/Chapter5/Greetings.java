package Chapter5;

import java.util.Scanner;

public class Greetings {
    public static void main(String args[]){

        System.out.println("Ingresa tu nombre:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }
    public static void greetUser(String name){

        System.out.println("Hola " + name);
    }
}
