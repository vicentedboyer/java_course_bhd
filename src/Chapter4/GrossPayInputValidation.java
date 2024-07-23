package Chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("Cuántas horas trabajaste esta semana?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Entrada invalida. Tus horas deben estar entre 1 y 40. Inténtalo de nuevo.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Salario bruto: $" + gross);

    }
}
