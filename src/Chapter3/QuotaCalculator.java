package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){

        int quota = 10;

        System.out.println("Ingrese el número de ventas que realizó esta semana:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("No cumpliste con tu cuota. Estabas " + salesShort + " ventas cortas");
        }
    }
}
