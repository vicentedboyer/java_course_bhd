package Chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]){

        System.out.println("Ingrese la cantidad de elementos que desea escanear: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i=0; i<quantity; i++){

            System.out.println("Ingrese el costo del artículo: ");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Tu total es $" + total);
    }

}