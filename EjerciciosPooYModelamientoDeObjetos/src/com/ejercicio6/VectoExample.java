package com.ejercicio6;

import java.util.Scanner;
import java.util.Vector;
/**
 *  La clase VectorExample sirve para crear un vector como experimentacion
 *  Se le solicitara al usuario añadir numeros al vector mediante el teclado
 *  si repite numeros el sistema se detendra automaticamente
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class VectoExample {
    public static void main(String[] args){
        Vector v = new Vector();
        Scanner userData = new Scanner(System.in);
        String firstLevelOptions;
        System.out.println("Escribe aqui debajo los numeros que deseas añadir" +
                "al vector, si repites numero se saldra");
        System.out.println("el sistema tiene" +
                "en la primera casilla el numero 1 por defecto ");

        /**
         * añadimos un primer elemento al vector para que no este vacia
         * la primera casilla y creamos las variables que usaremos en el
         * algoritmo
         */
        v.add(1);
        int lastPosition;
        int elementAtLastPosition;
        int duplicateChecker;
        int elementAtCurrentPosition;

        /**
         * El sistema recorre el vector llenandolo, en el momento en que
         * el sistema detecte duplicado seguido detendra el ciclo for
         */
        for(int i=1; i<10; i++){
            firstLevelOptions = userData.next();
            v.add(i,Integer.valueOf(firstLevelOptions));
            lastPosition = i - 1;
            elementAtLastPosition = (int) v.elementAt(lastPosition);
            elementAtCurrentPosition = Integer.valueOf(firstLevelOptions);
            duplicateChecker = elementAtCurrentPosition-elementAtLastPosition;
            if (duplicateChecker == 0){
                System.out.println("Has repetido numero! el sistema se " +
                        "detendra ahora");
                i = 11;
            }
        }

        /**
         * Una vez salimos por duplicado imprimimos el vector que habiamos
         * creado en el proceso
         */
        System.out.println("Tus numeros ingresados son:");
        for(int i=0; i<v.size(); i++){
            System.out.print(v.elementAt(i)+"\t");
        }
    }
}
