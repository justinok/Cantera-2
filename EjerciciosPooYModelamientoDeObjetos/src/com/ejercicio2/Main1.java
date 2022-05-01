package com.ejercicio2;
/**
 * Esta clase Main corresponde al ejercicio #2
 *
 * Se creoron 2 clases main con el mismo constructor main para ver cual
 * inicializaba el programa o si presentaba algun error, sin embargo solo me
 * solicito desde cual main queria correr el programa.
 *
 * Cree:
 *      -el Main del proyecto de los planetas en otro paquete
 *      -los dos mains en este paquete y un sub main con otro argumento
 *
 * Todo para experimntar que sucedia, en stack overflow encontre que si se podia
 * tener mas de un main siempre y cuando se hiciera una sobre carga del
 * metodo main.
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Main1 {
    public static void main(String[] args){
        System.out.println("Este es el main 1");
    }
    public static void main (int i) {
        i = 1;
        System.out.println("Intento de un segundo main cambiando el argumento" + i);
    }
}
