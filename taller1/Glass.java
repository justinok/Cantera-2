package taller1;

/**
 * @author Justin Alejandro Diaz
 * Clase que representa un vaso o una copa, con atributos como el tamaño en Onzas, el tipo de bebida y si tiene contenido
 */
public class Glass {
    /**
     * Creamos los atributos del vaso
     */
    public Integer sizeInOz;
    private String drinkName;
    private Boolean hasDrinkInside;

    /**
     * Getter para obtener el nombre de la bebida que estaba bebiendo el usuario
     * @return Devuelve el nombre de la bebida
     */
    public String getDrinkName() {
        return drinkName;
    }

    /**
     * Setter para cambiar la bebida a voluntad
     * @param drinkName Atributo a cambiar
     */
    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    /**
     * Getter para saber si aun tiene liquido o ya se lo acabo
     * @return Devuelve True si aun tiene y False si ya se lo acabo
     */
    public Boolean getHasDrinkInside() {
        return hasDrinkInside;
    }

    /**
     * Setter para hacer que se rellene el vaso del usuario a voluntad
     * @param hasDrinkInside Atributo a cambiar
     */
    public void setHasDrinkInside(Boolean hasDrinkInside) {
        this.hasDrinkInside = hasDrinkInside;
    }






}
