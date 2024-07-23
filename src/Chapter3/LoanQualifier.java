package Chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Ingresa tu salario:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Ingrese el número de años con su empleador actual:");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("¡Felicitaciones! Usted califica para el préstamo");
            }
            else{
                System.out.println("Lo sentimos, debes haber trabajado en tu trabajo actual "
                        + requiredYearsEmployed + " años.");
            }
        }
        else{
            System.out.println("Lo sentimos, debes ganar al menos $"
                    + requiredSalary + " para calificar para el préstamo");
        }

    }
}
