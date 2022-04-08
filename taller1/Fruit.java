package taller1;
/**
 * Esta clase representa a una fruta con atributos como el nombre, el peso promedio y los colores
 * @author Justin Alejanrdo Diaz
 */

/**
 * importamos ArrayList
 */


import java.util.ArrayList;

public class Fruit {

    /**
     * Definimos todos los atributos de la fruta
     */
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors;

    /**
     * Getter para obtener los colores de la fruta
     * @return Devuelve colores de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Setter para obtener y modificar los colores
     * @param colors es Atributo que de modificara
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Dado que el peso promedio es privado creamos este Getter para poder acceder a esta variable
     * @return Devuelve el peso promedio
     */
    public Float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Setter para modificar el pesopromedio de la fruta
     * @param averageWeight es la variable que se modificara
     */
    public void setAverageWeight(Float averageWeight) {
        this.averageWeight = averageWeight;
    }

}
