package com.ejercicio4y5;
/**
 *  La clase Plane nos ayuda a crear cualquier avion qur vayamos a añadir al
 *  sistema
 *
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Plane extends Vehicle {
    /**
     * Se define que es un vehiculo aereo, tiene 8 llantas de aterrizaje.
     */
    private static final Vehicle.TipeOfVehicle aquaticTerrestialOrAerial
            = TipeOfVehicle.AERIAL;
    private static final Integer numberOfTires = 8;
    private Fuel energySource;
    private Boolean itIsPrivate;

    /**
     * Constructor del avion
     *
     * @param numberOfPassengers # de pasajeros que puede llevar
     * @param fullAutomaticPilot ¿Tiene piloto automatico?
     * @param matriculationDate Fecha de matriculacion en sistema marino
     * @param energySource ¿Que tipo de combustible utiliza
     */
    public Plane(Integer numberOfPassengers, Boolean fullAutomaticPilot,
                 String matriculationDate, Fuel energySource,
                 Boolean itIsPrivate) {

        super(numberOfPassengers, fullAutomaticPilot, numberOfTires,
                matriculationDate, aquaticTerrestialOrAerial);

        this.energySource = energySource;
        this.itIsPrivate = itIsPrivate;
    }

    /**
     * Definimos los posibles combustibles que puede usar nuestra avion para
     * evitar problemas de sistematizacion
     *
     */
    enum Fuel{
        ELECTRIC , GAS , HIDROGEN , CARBON
    }

    /**
     * Creamos sobre carga de metodo tooSting para poder mostrar al usuario
     * la informacion completa de la bicicleta que esta preguntando
     *
     * @return Devuelve informacion completa de todos los atirbutos de la
     *          bicicleta
     */

    @Override
    public String toString() {
        return "Este avion es privado? " + itIsPrivate +
                " utiliza como fuente de energia " + energySource + '\n' +
                "fue matriculado en el sistema urbano el " +
                getMatriculationDate()+
                " y tiene "+ numberOfTires + " llantas para aterrizar " + '\n' +
                "puede llevar " + getNumberOfPassengers() + "personas";
    }
}