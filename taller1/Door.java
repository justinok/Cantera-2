package taller1;

/**
 * @author  Justin Alejandro Diaz
 * Esta clase representa a una puerta que tiene como atributos si esta abierta o cerrada, su clave y su locacion
 */
public class Door {
    /**
     * Creamos todos los atributos de la puerta
     */
    public String location;
    private Boolean status;
    private Integer doorCode;

    /**
     * Getter para obtener el codigo de la puerta
     * @return Devuelve el codigo de la puerta
     */
    public Integer getDoorCode() {
        return doorCode;
    }

    /**
     * Setter para cambiar el codigo de la puerta
     * @param doorCode Atributo a cambiar
     */
    public void setDoorCode(Integer doorCode) {
        this.doorCode = doorCode;
    }

    /**
     * Getter para saber si la puerta esta abierta o cerrada
     * @return Devuelve el estado de la puerta, True abierta, False cerrada
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * Setter para cambiar el estado de la puerta, en otras palabras abrirla o cerrarla
     * @param status Atributo a cambiar
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }



}
