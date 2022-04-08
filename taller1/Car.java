package taller1;

/**
 * @author Justin Alejandro Diaz
 * Esta clase representa a un carro con atributos como el #de puertas, su color, su velocidad maxima, su marca y su peso
 */
public class Car {
    /**
     * Creamos los atributos del carro
     */
    public Integer numberOfDoors;
    public String color;
    private Integer maxSpeed;
    public String brand;
    public Integer weigth;

    /**
     * Getter para obtener la velocidad maxima del vehiculo
     * @return Decuelve su velocidad max
     */
    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Si tuneamos el auto y lo hacemos mas veloz este Setter puede modificar su velocidad maxima
     * @param maxSpeed atributo a modificar
     */
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }




}
