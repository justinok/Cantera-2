package com.ejercicio4y5;
/**
 *  La clase TractorTruck sirve para crear cualquier camion que vayamos a
 *  adquirir e ingresarlo en nuestro sistema, en este caso debermos añadir
 *  si lo tenemos arrendado o no y la ganancia mensual que nos deja
 *
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class TractorTruck extends Vehicle {
    /**
     * Se define que es u  vehiculo terrestre, tiene 6 llantas, y pide que
     * definamos si esta arrendado y la ganancia mensual que tenemos
     */
    private static final TipeOfVehicle aquaticTerrestialOrAerial
            = TipeOfVehicle.TERRESTIAL;
    private static final Integer numberOfTires = 6;
    private Fuel energySource;
    private Boolean itIsRented;
    private String monthlyProfit;


    /**
     * Creamos el constructor del camion
     *
     * @param numberOfPassengers # de pasajeros que puede llevar
     * @param fullAutomaticPilot ¿Tiene piloto automatico?
     * @param matriculationDate Fecha de matriculacion en sistema marino
     * @param energySource ¿Que tipo de combustible utiliza
     * @param itIsRented ¿Esta arrendada?
     * @param monthlyProfit ¿Cuanta ganancia nos deja mensualmente?
     */
    public TractorTruck(Integer numberOfPassengers, Boolean fullAutomaticPilot,
                        String matriculationDate, Fuel energySource,
                        Boolean itIsRented,String monthlyProfit) {

        super(numberOfPassengers, fullAutomaticPilot, numberOfTires,
                matriculationDate, aquaticTerrestialOrAerial);


        this.energySource = energySource;
        this.itIsRented = itIsRented;
        this.monthlyProfit = monthlyProfit;


    }

    /**
     * Definimos los posibles combustibles que puede usar nuestra camion para
     * evitar problemas de sistematizacion
     *
     */
    enum Fuel{
        ELECTRIC , GAS , HIDROGEN , SEMIELECTRIC
    }


    /**
     * Creamos sobre carga de metodo tooSting para poder mostrar al usuario
     * la informacion completa del camion que esta preguntando
     *
     * @return Devuelve informacion completa de todos los atirbutos del
     *          camion
     */

    @Override
    public String toString() {
        return "Este camion tiene estado de arrendamiento " + itIsRented +
                " deja de gannacia mensual " + monthlyProfit +
                " utiliza como fuente de energia " + energySource + '\n' +
                "fue matriculado en el sistema urbano el " +
                getMatriculationDate()+
                " y tiene "+ numberOfTires + " llantas " + '\n' +
                "puede llevar " + getNumberOfPassengers() + "personas";
    }
}
