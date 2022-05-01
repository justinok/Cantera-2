package com.ejercicio4y5;


import java.util.Arrays;
import java.util.Scanner;

/**
 *  La clase VehiclesOnGarage nos da informacion de nuestro garage y los
 *  vehiculos que tenemos en el sistema, de aqui se corre todo el sistema
 *
 *  Creamos los objetos de cada tipo de vehiculo y posteriormente creamos
 *  la interfaz por consola para que el usuario pueda acceder a la informacion
 *  de cada vehiculo
 *  ------
 *  Se puede crear un modelo donde cada vez que se ingresa al garage se añade
 *  el kilometraje nuevo al sistema y se avisa dentro de cuanto
 *
 *
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class VehiclesOnGarage {


    public static void main(String[] args){
        Scanner userData = new Scanner(System.in);
        String firstLevelOptions;
        String secondLevelOptions;

        /**
         * Creamos todos los objetos referentes a los tipos de vehiculos
         * que estan en nuestro sistema
         */
    Bicycle electricBicycle = new Bicycle(1,Boolean.TRUE,
            "12/02/2021", Bicycle.Fuel.ELECTRIC,"17 Kg",
            Bicycle.Type.CITY);
    Bicycle mountainBicycle = new Bicycle(1,Boolean.FALSE,
            "12/02/2021", Bicycle.Fuel.INERTIAL,"22 Kg",
            Bicycle.Type.MOUNTAIN);
    Ferry electricFerry = new Ferry(12,Boolean.FALSE,
            "03/03/2006", Ferry.Fuel.ELECTRIC,4,
            Boolean.FALSE);
    Motorcycle triumphTwin = new Motorcycle(2,Boolean.FALSE,
            "09/06/1996", Motorcycle.Fuel.GAS, "TRIUMPH");
    TractorTruck teslaSemi = new TractorTruck(2,Boolean.TRUE,
            "09/06/1996", TractorTruck.Fuel.SEMIELECTRIC,
            Boolean.TRUE,"$2500 USD");
    Car ford = new Car(4,Boolean.FALSE,
            "09/06/1996", Car.Fuel.GAS,
            "Ford Mustang GT");
    Car tesla = new Car(4,Boolean.TRUE,
            "09/06/1996", Car.Fuel.ELECTRIC,
                "Tesla model S");
    Car selfMade = new Car(4,Boolean.FALSE,
            "09/06/1996", Car.Fuel.HIDROGEN,
            "369 Model 1");
    Plane privateJET = new Plane(12,Boolean.TRUE,
            "05/09/1996", Plane.Fuel.GAS, Boolean.TRUE);
    TractorTruck freightliner = new TractorTruck(4,
            Boolean.FALSE,"03/03/2006", TractorTruck.Fuel.GAS,
            Boolean.TRUE,"$2000 USD");


        /**
         * Creamos y mostramos la interfaz al usuario para invoque la manera
         * de organizar que desea
         */


        System.out.println("A continuacion veras los vehiculos en nuestro" +
                "sistema, por favor elige el vehiculo del cual quieres " +
                "saber informacion ");
        System.out.println("------------ Vehiculos en sistema --------------");
        System.out.println("------ Bicicletas ");
        System.out.println("1. Bicicleta electrica de ciudad");
        System.out.println("2. Bicicleta corriente de montaña");
        System.out.println("------ Ferrys ");
        System.out.println("3. Mediano de 12 personas");
        System.out.println("------ Motocicletas ");
        System.out.println("4. Triumph Twin");
        System.out.println("------ Camiones ");
        System.out.println("5. Freightliner");
        System.out.println("6. Tesla Semi");
        System.out.println("------ Automoviles ");
        System.out.println("7. Ford Mustang GT");
        System.out.println("8. Tesla Moodelo S");
        System.out.println("9. Realizado en nuestro taller");
        System.out.println("------ Aviones ");
        System.out.println("10. Jet privado");
        System.out.println("Escribe el numero de tu metodo preferido de " +
                "organizacion aqui abajo:");
        firstLevelOptions = userData.next();
        switch (firstLevelOptions){

            /**
             * Se utilizo el metodo de verificar si el vehiculo necesita
             * mantenimiento se puede aplicar a todos los vehiculos
             */
            case "1":
                System.out.println(electricBicycle.toString());
                System.out.println("---------------------------");
                System.out.println("Lo estas ingresando al garage?" +
                        "si es asi escribe el # de kilometos de este " +
                        "viaje, de lo contrario escribe 11 para salir.");
                secondLevelOptions = userData.next();
                if (secondLevelOptions=="11"){
                    break;
                } else
                    electricBicycle.healthCheckerForMaintenarce(
                            Integer.valueOf(secondLevelOptions));
                    break;

            case "2":
                System.out.println(mountainBicycle.toString());

                break;
            case "3":
                System.out.println(electricFerry.toString());
                break;
            case "4":
                System.out.println(triumphTwin.toString());
                break;
            case "5":
                System.out.println(freightliner.toString());
                break;
            case "6":
                System.out.println(teslaSemi.toString());
                break;
            case "7":
                System.out.println(ford.toString());
                break;
            case "8":
                System.out.println(tesla.toString());
                break;
            case "9":
                System.out.println(selfMade.toString());
                break;
            case "10":
                System.out.println(privateJET.toString());
                break;

        }

    }
}