package Chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Ingresa tu sueldo:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Ingresa tu cantidad de años laborando en la empresa:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary && years >= requiredYearsEmployed){
            System.out.println("Felicidades! Calificas para el prestamo.");
        }
        else{
            System.out.println("Lo sentimos, debes ganar al menos $"
                    + requiredSalary + " para calificar para el préstamo");
        }
    }
}
