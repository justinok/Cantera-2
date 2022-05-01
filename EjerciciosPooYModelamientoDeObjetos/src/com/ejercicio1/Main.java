package com.ejercicio1;

/**
 * Esta clase Main se usa para crear dos planetas de la clase Planet para
 * posteriormente calcular la fuerza gravitaroria entre ellos usando la
 * Ley de gravitacion Universal. Como este es un modelamiento de un fenomeno
 * Fisico, vamos a incluir los supuestos necesarios para que el programa sea
 * realizable:
 *            -Se supone orbita circular
 *            -Se supone que estan alineados en orbita
 *            -Se supone no intervencion gravitatoria de un cuerpo que se
 *             encuentre entre los dos cuerpos a los que se le aplica el
 *             calculo.
 *            -Se supone que los planetas son esferas
 *
 * Para eliminar algunos supuestos se requeriria crear un eje de cordenadas con
 * centro en el sol para poder encontrar la ubicacion de los dos cuerpos y de
 * esta forma usando relaciones aritmeticas encontrar la distancia en
 * cualesquiera dos puntos de las orbitas. Pese a que suena divertido crear un
 * modelo complejo esto se sale de los limites solicitados para el ejercicio.
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Main {
    public static void main(String[] args){
        /**
         * Se crean dos objetos, dos planetas de la clase Planet
         * para aplicar el calculo de la Ley de gravitacion universal.
         */
        Planet mercurio = new Planet(10000,40000,
                400,1, "mercurio");
        Planet venus = new Planet(500, 4000,
                4000,2, "venus");

        /**
         * Se realizan los calculos necesarios de la Ley gravitacional
         * @param distance = Distancia entre los cuerpos al restar orbitas
         * @param sqareDistance = Elevamos al cuadrado la distancia
         * @param gravitationalConstant = Inclusion de constate Gravitacional
         * @param massProduct = producto de las masas de los dos cuerpos
         * @param numerator = Numerador de la ecuacion ( G * M * m)
         * @param gravitationalForce = Ley de gravitacion universal
         */
        int distance = (mercurio.getOrbitRadius() - venus.getOrbitRadius());
        int sqareDistance = (int) Math.pow(distance,2);
        double gravitationalConstant = Math.pow(6.67,-11);
        int massProduct = (mercurio.getMass() * venus.getMass());
        double numerator = (double) (massProduct * gravitationalConstant);
        double gravitationalForce = numerator / sqareDistance;

        /**
         * Imprimimos el resultado del calculo
         */
        System.out.println("la fuerza gravitacional entre " + "\n"
                + mercurio.toString() + "\n" + "y " + "\n"
                + venus.toString() + "\n"
                + "cuando estan alineados en orbita"
                + "es " + gravitationalForce + "Newtons");

    }
}
