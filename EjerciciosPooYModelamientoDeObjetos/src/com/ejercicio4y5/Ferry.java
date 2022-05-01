package com.ejercicio4y5;
/**
 *  La clase Ferry se usa para dar forma a un bote grande tipo Ferry, la
 *  carga de pasajeros promedio del ferry es de 12 - 18 pasajeros.
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Ferry extends Vehicle {
    /**
     * Necesitamos definir que el ferry solo funciona en medio acuatico
     * por lo que no tiene llantas
     * se debe definir el tipo de combustible, el numero de cuartos que tiene y
     * si puede cargar automobiles
     */
    private static final Vehicle.TipeOfVehicle aquaticTerrestialOrAerial
            = TipeOfVehicle.AQUATIC;
    private static final Integer numberOfTires = 0;

    private Fuel energySource;
    private Integer numberofRooms;
    private Boolean canCarryCars;


    /**
     * Creamos el constructor de Ferry
     *
     * @param numberOfPassengers # de pasajeros que puede llevar
     * @param fullAutomaticPilot ¿Tiene piloto automatico?
     * @param matriculationDate Fecha de matriculacion en sistema marino
     * @param energySource ¿Que tipo de combustible utiliza
     * @param numberofRooms ¿Cuantos cuartos tiene?
     * @param canCarryCars ¿Puede llevar automobiles?
     */
    public Ferry(Integer numberOfPassengers, Boolean fullAutomaticPilot,
                 String matriculationDate, Fuel energySource,
                 Integer numberofRooms, Boolean canCarryCars) {

        super(numberOfPassengers, fullAutomaticPilot, numberOfTires,
                matriculationDate, aquaticTerrestialOrAerial);

        this.energySource = energySource;
        this.numberofRooms = numberofRooms;

    }

    /**
     * Definimos los posibles combustibles que puede usar nuestro ferry para
     * evitar problemas de sistematizacion
     *
     */
    enum Fuel{
        ELECTRIC , GAS , HIDROGEN , CARBON
    }

    /**
     * Creamos sobre carga de metodo tooSting para poder mostrar al usuario
     * la informacion completa del Ferry que esta preguntando
     *
     * @return Devuelve informacion completa de todos los atirbutos del Ferry
     */
    @Override
    public String toString() {
        return "Este Ferry puede llevar " + getNumberOfPassengers() + "personas"
                + " tiene " + numberofRooms + " habitaciones " +
                " utiliza como fuente de energia " + energySource + '\n' +
                " fue matriculado en el sistema urbano el " +
                getMatriculationDate()+ " y su capacidad para cargar carros es "
                + canCarryCars ;
    }
}
