package taller;

/**
 * @author Justin Alejandro Diaz Jimenez
 * Esta es una clase abstracta como molde de nave espacial(Spacecraft) para ser usada en diversas clases de naves
 */
public abstract class Spacecraft {
    /**
     * Creamos todos los atributos de la nave
     */
    private String power;
    private String weight;
    private String purpose;
    private String fuelType;
    private String category;
    private String message;


    /**
     * Inicializamos todas las variables como buenas practicas
     */
    public Spacecraft(){
        this.power = "";
        this.weight = "";
        this.purpose = "";
        this.fuelType = "";
        this.category = "";
        this.message = "Are you ready captain?";

    }

    /**
     * Creamos todos los Getter y Setter de todos los atributos
     *
     */
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Este metodo es para crear una pequeña pausa entre los mensajes de dialogo
     * @param ms Es la cantidad en milisegundos que hara la pausa el sistema
     */
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }


}
