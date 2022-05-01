package com.ejercicio1;

import java.util.Objects;
/**
 * En esta clase modelamos el objeto de planeta para ser usado en la
 * construccion de un modelo de gravitacion entre dos cuerpos.
 *
 * Atributos solicitados
 * -masa
 * -densidad
 * -diametro
 * -radio de orbita desde el sol
 * -Id de planeta
 * -Nombre
 *
 * Atributos necesarios para calculo
 * -radio
 * -volumen
 *
 * @version 1.01.001 2022-04-28
 *
 * @author Justin Alejandro Diaz - jusadiazjim@unal.edu.co
 *
 * @since 1
 */
public class Planet {

    /**
     * Creamos todas los atributos que nuestro planeta requiere
     *
     */
    private final Integer mass; /* masa en kilogramos */

    private  Double density; /* Variable que se calcula internamente */

    private final Integer diameter; /* Diametro planetario en metros*/
    private Integer orbitRadius; /* Radio de orbita en metros*/
    private Integer radius; /* (Diametro / 2) */
    private Double volume; /* Volumen de esfera = (4/3)* Pi * r^3 */
    private Integer id; /* Identificador de planeta en el sistema planetario */
    private final String name; /* Nombre de planeta */

    /**
     * Constructor publico de la clase Planet
     *
     * @param mass requerimos que no sea nulo
     * @param diameter requerimos que no sea nulo
     * @param orbitRadius puede ser nulo si es el sol
     * @param id identificador
     * @param name nombre de planeta
     *
     * Calculamos usando las variables de arriba los parametros radio, volumen
     *             y densidad.
     *
     * @throws IllegalArgumentException En caso de que se ponga un radio
     *                                  regativo, una masa negativa o nula,
     *                                  diametro negativo o nulo
     */
    public Planet(Integer mass, Integer diameter,
                  Integer orbitRadius, Integer id, String name) {
        this.mass = Objects.requireNonNull(mass);

        this.diameter = Objects.requireNonNull(diameter);
        this.orbitRadius = orbitRadius;
        this.radius = this.diameter / 2;
        this.volume = 1.33 * Math.PI * Math.pow(this.radius,3);
        this.id = id;
        this.name = name;
        this.density = this.mass / this.volume;
        if(orbitRadius < 0){
            throw new IllegalArgumentException(
                    "No puede tener una orbita negativa o nula");
        }
        if(mass <= 0){
            throw new IllegalArgumentException(
                    "No puedes crear planetas de antimateria aqui");
        }
        if(diameter <= 0){
            throw new IllegalArgumentException(
                    "No puede tener una densidad negativa o nula");
        }
    }

    /**
     * Metodos Getter para preguntar sobre los atributos masa y radio de orbita
     *
     * @return masa y radio de orbita del planeta
     */
    public Integer getMass() {
        return mass;
    }
    public Integer getOrbitRadius() {
        return orbitRadius;
    }

    /**
     * Creamos un metodo tooString para imprimir la informacion completa
     * del planeta
     *
     * @return todos los atributos del planeta.
     */
    @Override
    public String toString() {
        return name + "{" +
                "mass=" + mass +
                ", density=" + density + '\'' +
                ", diameter=" + diameter +
                ", orbit radius=" + orbitRadius +
                ", id= " + id +
                '}';
    }
}
