package com.ejercicio4y5;
/**
 *  La clase Car nos ayuda a crear cualquier carro qur vayamos a añadir al
 *  sistema
 *
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Car extends Vehicle {
    /**
     * Se define que es un vehiculo terrestre, tiene 4 llantas, y pide que
     * definamos su marca y modelo
     */
    private static final TipeOfVehicle aquaticTerrestialOrAerial
            = TipeOfVehicle.TERRESTIAL;
    private static final Integer numberOfTires = 4;
    private Fuel energySource;
    private String brandAndModel;

    /**
     * Constructor del carro que vamos a ingresar al sistema
     *
     * @param numberOfPassengers # de pasajeros que puede llevar
     * @param fullAutomaticPilot ¿Tiene piloto automatico?
     * @param matriculationDate Fecha de matriculacion en sistema marino
     * @param energySource ¿Que tipo de combustible utiliza
     * @param brandAndModel ¿Que marca y modelo es?
     */
    public Car(Integer numberOfPassengers, Boolean fullAutomaticPilot,
               String matriculationDate, Fuel energySource,
               String brandAndModel) {

        super(numberOfPassengers, fullAutomaticPilot, numberOfTires,
                matriculationDate, aquaticTerrestialOrAerial);

        this.energySource = energySource;
        this.brandAndModel = brandAndModel;


    }

    /**
     * Definimos los posibles combustibles que puede usar nuestra carro para
     * evitar problemas de sistematizacion
     *
     */
    enum Fuel{
        ELECTRIC , GAS , HIDROGEN
    }

    /**
     * Creamos sobre carga de metodo tooSting para poder mostrar al usuario
     * la informacion completa del carro que esta preguntando
     *
     * @return Devuelve informacion completa de todos los atirbutos del
     *          carro
     */

    @Override
    public String toString() {
        return "Este carro es un " + brandAndModel +
                " utiliza como fuente de energia " + energySource + '\n' +
                "fue matriculado en el sistema urbano el " +
                getMatriculationDate()+
                " y tiene "+ numberOfTires + " llantas " + '\n' +
                "puede llevar " + getNumberOfPassengers() + "personas";
    }
}
