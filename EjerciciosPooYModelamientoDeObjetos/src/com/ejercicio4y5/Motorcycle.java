package com.ejercicio4y5;
/**
 *  La clase Motorcycle se usa para crear cualquier motocicleta que vayamos a
 *  comprar y poder añadirla a nuestro sistema
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Motorcycle extends Vehicle {
    /**
     * Necesitamos definir que la motocicleta solo funciona en medio terrestre
     * y  tiene 2 llantas
     * se debe definir el tipo de combustible y la marca de la moto
     */
    private static final Vehicle.TipeOfVehicle aquaticTerrestialOrAerial
            = Vehicle.TipeOfVehicle.TERRESTIAL;
    private static final Integer numberOfTires = 2;
    private Fuel energySource;
    private String Brand;

    /**
     * Creamos el constructor de la motocicleta y los datos que necesitaremos
     *
     * @param numberOfPassengers # de pasajeros que puede llevar
     * @param fullAutomaticPilot ¿Tiene piloto automatico?
     * @param matriculationDate Fecha de matriculacion en sistema marino
     * @param energySource ¿Que tipo de combustible utiliza
     * @param Brand ¿Que marca es?
     */
    public Motorcycle(Integer numberOfPassengers, Boolean fullAutomaticPilot,
               String matriculationDate, Fuel energySource,String Brand) {

        super(numberOfPassengers, fullAutomaticPilot, numberOfTires,
                matriculationDate, aquaticTerrestialOrAerial);

        this.energySource = energySource;
        this.Brand = Brand;
    }

    /**
     * Definimos los posibles combustibles que puede usar nuestra moto para
     * evitar problemas de sistematizacion
     *
     */
    enum Fuel{
        ELECTRIC , GAS , HIDROGEN
    }


    /**
     * Creamos sobre carga de metodo tooSting para poder mostrar al usuario
     * la informacion completa de la motocicleta que esta preguntando
     *
     * @return Devuelve informacion completa de todos los atirbutos de la
     *          motocicleta
     */

    @Override
    public String toString() {
        return "Esta motocicleta de marca " + Brand +
                " utiliza como fuente de energia " + energySource + '\n' +
                "fue matriculado en el sistema urbano el " +
                getMatriculationDate()+
                " y tiene "+ numberOfTires + " llantas " +
                "para poder cargar " + getNumberOfPassengers() + "personas";
    }
}
