package taller1;
/**
 * Esta clase representa a una persona cuyos posibles atributos son el nombre, los apellidos, su fecha de nacimiento y su altura
 * @author Justin Alejandro Diaz
 */

/**
 * importamos Date para poder usarlo en la fecha de nacimiento
 */

import java.util.Date;


public class Person {
    /**
     * Declaramos los atributos de la Persona, name como nombre, lastName1 y 2 como primer y segundo apellido correspondientemente, dateBith como fecha de nacimiento y height como altura
     */
    public String name;
    public String lastName1;
    public String LastName2;
    public Date dateBirth;
    public Float height;

    /**
     * Constructor para inicializar la variable de nombre
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Devuelve el nombre de la persona, un Getter
     * @return Nombre de la persona
     */
    public String getName() { return name;}

    /**
     * Obtiene y cambia el nombre de la persona, un Setter
     * @param name Valor a cambiar
     */
    public void setName(String name) { this.name = name;}
}


