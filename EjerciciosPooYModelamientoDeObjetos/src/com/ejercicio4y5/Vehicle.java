package com.ejercicio4y5;

/**
 *  La clase Vehiculo se usa como esqueleto base para construir y caracterizar
 *  cualquier vehiculo en nuestro sistema, se usara para que cada tipo de
 *  vehiculo pueda heredar de esta clase los atributos y comportamientos
 *  necesarios en nuestro sistema
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Vehicle {

    /**
     * Creamos los atributos que nuestro vehiculo necesitara para su
     * caracterizacion
     */
    private Integer numberOfPassengers;
    private Boolean fullAutomaticPilot;
    private Integer numberOfTires;
    private String matriculationDate;
    private TipeOfVehicle aquaticTerrestialOrAerial;
    private Integer mileage;
    private Integer healthChecker = 0;

    /**
     * Creamos el constructor de la Clase Vehiculo que recibe los atributos
     * principales que nuestro esqueleto de vehiculo debe tener.
     * Se implemento dos If's para arrojar excepciones si se llegase a poner
     * datos incorrectos:
     * @throws IllegalArgumentException Si pone algo menor que cero ya que no
     *                                  tiene sentido
     *
     * @param numberOfPassengers # de pasajeros
     * @param fullAutomaticPilot ¿Tiene piloto automatico?
     * @param numberOfTires # de llantas
     * @param matriculationDate Fecha de matriculacion en el sistema urbano
     * @param aquaticTerrestialOrAerial ¿En que medio anda?
     */
    public Vehicle(Integer numberOfPassengers, Boolean fullAutomaticPilot,
                   Integer numberOfTires, String matriculationDate,
                   TipeOfVehicle aquaticTerrestialOrAerial) {
        this.numberOfPassengers = numberOfPassengers;
        this.fullAutomaticPilot = fullAutomaticPilot;
        this.numberOfTires = numberOfTires;
        this.matriculationDate = matriculationDate;
        this.aquaticTerrestialOrAerial = aquaticTerrestialOrAerial;
        this.mileage = 0;
        if (numberOfPassengers < 0) {
            throw new IllegalArgumentException(
                    "No puede tener numero de pasajeros negativos!");
        }
        if (mileage < 0) {
            throw new IllegalArgumentException(
                    "No puede tener kilometraje negativo!");
        }
    }

    /**
     * Definimos que solo puedodemos tener 3 tipos de vehiculos debido a las
     * limitaciones de nuestro garage.
     * Tal vez algun dia podamos añadir SPACIAL!
     */
    public enum TipeOfVehicle{
        AQUATIC , TERRESTIAL, AERIAL
    }

    /**
     * Cada vez que ingresemos los vehiculos al garage deberemos registrar
     * cuanto fue el nuevo kilometraje del vehiculo. Se debe hacer un
     * mantenimiento del vehiculo cada 5000 Km, cada vez que checker llegue a 1
     * el metodo avisara al registrador que necesita mantenimiento el vehiculo.
     * Si el auto no necesita aun el metodo le dira en que porcentaje de
     * desgaste va el anterior mantenimiento. ex: 0,03%
     * mileage = se va actualizando luego de cada viaje
     * healChecker = se va llenando de 0 hasta 5000 Km y se reinicia
     *
     * @param journeyKM Kilometraje de ultimo viaje
     * @return Devuelve el ultimo kilometraje añadido
     */
    public Integer healthCheckerForMaintenarce(Integer journeyKM){
        mileage = mileage + Integer.valueOf(journeyKM);
        healthChecker = healthChecker + Integer.valueOf(journeyKM);
        double checker = (healthChecker / 5000)*100;

        if (checker == 1) {
            healthChecker = healthChecker - healthChecker;
            throw new IllegalStateException("El auto necesita mantenimiento!");
        }
        System.out.println("El mantenimiento esta un " + checker
                + "% desgastado y el kilometraje añadido en este ultimo" +
                "viaje es de "+ journeyKM + "Km");

        return journeyKM;
    }

    /**
     * Creamos los metodos Getter y Setter para las variables que vamos a
     * usar en nuestro programa
     *
     * @return Valor de X atributo
     *
     */
    public Boolean getFullAutomaticPilot() {
        return fullAutomaticPilot;
    }
    public TipeOfVehicle getAquaticTerrestialOrAerial() {
        return aquaticTerrestialOrAerial;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public Integer getNumberOfTires() {
        return numberOfTires;
    }

    public String getMatriculationDate() {
        return matriculationDate;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Integer getHealthChecker() {
        return healthChecker;
    }
}

