package taller1;

/**
 * Clase para representar una cuenta bancaria y si se encuentra activa como atributo de la misma
 * @author Justin Alejandro Diaz
 */
public class BankAccount {
    /**
     * Creamos los atributos de la clase
     */
    private Integer accountNumber;
    protected Boolean activated ;

    /**
     * Creamos un Getter para obtener la informacion de la cuenta sobre su estado actual
     * @return Devuelve si la cuenta esta activada o desactivada
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Setter para cambiar el estatus de activacion de la cuenta
     * @param activated Es el parametro que cambiaremos a voluntad
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
