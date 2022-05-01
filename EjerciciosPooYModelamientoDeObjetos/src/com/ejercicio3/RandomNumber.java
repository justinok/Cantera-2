package com.ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * La clase RandomNumber crea un Array de 10 numeros aleatorios enteros
 * posteriormente ofrece una interfaz al usuario para que el pueda escoger
 * de que forma desea organizar el Array, se puede usar el metodo de la burbuja
 * o de QuickSort segun peticion del ejercicio.
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class RandomNumber {
    /**
     * Se aplica el metodo de la burbuja para organizar el Array en orden
     * ascendente.
     * Recorre todo el Array analizando cual es mayor y haciendo los cambios
     * si lo ve necesario
     * @param arr1 Devuelve el array organizado
     */
    static void bubbleAscending(int[] arr1) {
        int n = arr1.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr1[j - 1] > arr1[j]) {
                    //Codigo para intercambiar elementos
                    temp = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
    }
    /**
     * Se aplica el metodo de la burbuja para organizar el Array en orden
     * descendente.
     * Recorre todo el Array analizando cual es mayor y haciendo los cambios
     * si lo ve necesario
     * @param arr1 Devuelve el array organizado
     */
    static void bubbleDescending(int[] arr1) {
        int n = arr1.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr1[j - 1] < arr1[j]) {
                    //Code to swap the elements
                    temp = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        /**
         * Creamos las variables que vamos a usar
         */
        Scanner userData = new Scanner(System.in);
        String firstLevelOptions;
        int[] arr1;
        arr1 = new int[10];
        int size = arr1.length;

        /**
         * Añadimos los numeros aleatorios al Array arr1
         */
        for (int i = 0; i < arr1.length; i++) {
            double doubleRandomNumber=Math.random() * 10;
            int randomNumber = (int)doubleRandomNumber;
            double a = Math.random() * 10;
            arr1[i] = randomNumber;
        }

        /**
         * Creamos y mostramos la interfaz al usuario para invoque la manera
         * de organizar que desea
         */
        System.out.println("Hemos creado un Array con numeros aleatorios" +
                "para ti: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("------- Opciones --------------");
        System.out.println("1. Organizar el Array con el metodo de la burbuja" +
                "en orden ascendente");
        System.out.println("2. Organizar el Array con el metodo de la burbuja" +
                "en orden descendente");
        System.out.println("3. Organizar el Array con el metodo de QuickSort");
        System.out.println("Escribe el numero de tu metodo preferido de " +
                        "organizacion aqui abajo:");
        firstLevelOptions = userData.next();
        switch (firstLevelOptions){
            case "1":
                bubbleAscending(arr1);
                System.out.println("Array organizado con metodo de la burbuja "
                        + "en orden ascendente: ");
                System.out.println(Arrays.toString(arr1));
                break;

            case "2":
                bubbleDescending(arr1);
                System.out.println("Array organizado con metodo de la burbuja "
                        + "en orden descendente: ");
                System.out.println(Arrays.toString(arr1));
                break;
            case "3":
                Quicksort.quickSort(arr1, 0, size - 1);
                System.out.println("Array organizado con QuickSort: ");
                System.out.println(Arrays.toString(arr1));
        }
    }
}
