package Chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Ingrese el número de ventas que realizó esta semana:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("No cumpliste con tu cuota. Estabas " + salesShort + " ventas cortas");
        }
    }
}
