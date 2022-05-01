package com.ejercicio4y5;
/**
 *  La clase Bicycle se usa para construir las bicicletas que tendremos en
 *  nuestro garage, se incluyen algunos datos que son unicos de las ciclas
 *  como el numero de ruedas y el medio por el cual se mueve el vehiculo
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Bicycle extends Vehicle {
    /**
     * Creamos y definimos las variables que necesita la cicla, esta cicla
     * puede ser de ciudad, de montaña, puede ser electrica, normal, con motor
     * de gasolina y se guarda tambien el peso de la bicicleta para saber
     * cual escoger en cada salida que tendremos
     */
    private static final Vehicle.TipeOfVehicle aquaticTerrestialOrAerial
            = Vehicle.TipeOfVehicle.TERRESTIAL;
    private static final Integer numberOfTires = 2;
    private Fuel energySource;

    private String weigth;

    private Type type;

    /**
     * Creamos el constructor de nuestra bicicleta, el creador debera añadir
     * peso y tipo de cicla
     *
     * @param numberOfPassengers # de pasajeros
     * @param fullAutomaticPilot ¿Tiene piloto automatico? (Existen)
     * @param matriculationDate Fecha de matriculacion en el sitema urbano
     * @param energySource Fuente de energia de la bici - ENUM
     * @param weigth    Peso de la bici
     * @param type ¿Que tipo es la bicicleta ciudad o montaña? - ENUM
     */
    public Bicycle(Integer numberOfPassengers, Boolean fullAutomaticPilot,
                      String matriculationDate, Fuel energySource, String weigth,
                   Type type) {

        super(numberOfPassengers, fullAutomaticPilot, numberOfTires,
                matriculationDate, aquaticTerrestialOrAerial);

        this.weigth = weigth;
        this.energySource = energySource;
        this.type = type;

    }

    /**
     * Creamos las variables que tengra nuesto tipo de cicla y que
     * combustible usara, para asi tener la
     * certeza que el usuario solo escogera una de estas posibilidades y no
     * crear imprevistos en el registo al sistema
     */
    enum Type{
        CITY, MOUNTAIN
    }
    enum Fuel{
        ELECTRIC , GAS , HIDROGEN, INERTIAL
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
        return "Esta bicicleta pesa " + weigth +
                " especial para " + type +
                " utiliza como fuente de energia " + energySource + '\'' +
                " y tiene "+ numberOfTires + " llantas" ;
    }
}
