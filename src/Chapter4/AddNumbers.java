package Chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Ingrese el 1er Numero");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el 2do Numero");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("La suma es: " + sum);

            System.out.println("¿Quieres empezar de nuevo? Verdadero o falso");
            again = scanner.nextBoolean();

        } while(again);

        scanner.close();
    }
}