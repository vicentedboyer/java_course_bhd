package Chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        //1.get the number of hours worked.
        System.out.println("Ingrese el numero de horas que trabaja a la semana:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Ingrese la tasa a calcular:");
        double rate = scanner.nextDouble();
        scanner.close();

        //3/.Multiply hours and pay rate.
        double grossPay = hours * rate;

        //4. Display result
        if (grossPay <= 100) {
            System.out.println("El calculo es $" + grossPay);
        }
        else{
            double done = grossPay - (rate / 2);
            System.out.println("Excede el monto a pagar semanal $" + grossPay);
            System.out.println("Se recalculo para hacer posible el pago, el monto a pagar es $" + done);
        }
    }
}
