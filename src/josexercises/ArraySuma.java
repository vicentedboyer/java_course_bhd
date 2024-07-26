package josexercises;

public class ArraySuma {
    public static void main(String[] args) {
        // Definir un array pa los enteros
        int[] array = {1, 2, 3, 4, 5};

        // Llamar a la función para sumar los elementos
        int sum = sumArray(array);

        // Imprimir la suma de los elementos del array
        System.out.println("La suma del array es: " + sum);
    }

    // Función para sumar los elementos de un array
    public static int sumArray(int[] array) {
        int sum = 0;

        // Iterar a través del array y sumar cada elemento
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}

