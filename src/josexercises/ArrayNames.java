package josexercises;

import java.util.ArrayList;

public class ArrayNames {
    public static void main(String args[]){
        //Creo el array para almacenar los nombres.
        ArrayList<String> names = new ArrayList<>();

        //Agrego los nombres.
        names.add("Aleanny");
        names.add("Vicente");
        names.add("Juan");
        names.add("Carlos");

        //Recorrer los nombres del Array y imprimirlos.
        for (String name : names){
            System.out.println(name);
        }
    }
}
