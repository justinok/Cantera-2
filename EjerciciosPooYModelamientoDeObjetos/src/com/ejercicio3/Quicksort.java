package com.ejercicio3;
/**
 * La clase RandomNumber crea un Array de 10 numeros aleatorios enteros
 * posteriormente ofrece una interfaz al usuario para que el pueda escoger
 * de que forma desea organizar el Array, se puede usar el metodo de la burbuja
 * o de QuickSort segun peticion del ejercicio.
 *
 * @version 1.01.001 2022-04-28
 *
 * @author programiz.com
 *
 * @since 1
 */
class Quicksort {

    // metodo para encontrar la posicion de la particion
    static int partition(int array[], int low, int high) {

        // escoge el ultimo elemento como pivot
        int pivot = array[high];

        // señalador para el elemento mas grande
        int i = (low - 1);

        // compara cada elemento con el pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // si un elemento es mas pequeño que el pivot
                // cambialo con el elemento señalado con i
                i++;

                // cambia el elemento en i con el elemento en j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // cambia el elemento de pivot con el señalado por i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // devuelve la posicion donde se realizo la particion
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // encuentra el pivot para que
            // elementos mas chicos que el pivot estan en la izquierda
            // elementos mas grandes que el pivot en la derecha
            int pi = partition(array, low, high);

            // llamada a la izquiera del pivot
            quickSort(array, low, pi - 1);

            // llamada en la derecha del pivot
            quickSort(array, pi + 1, high);
        }
    }
}