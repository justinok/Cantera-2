package taller;
/**
 * @author Justin Alejandro Diaz Jimenez
 * Esta es una intefaz donde se impementaran los comportamientos de la nave
 */
public interface Protocols {
    /**
     * Realmente podia situar esto en la clase abstracta de Spacecraft, lo hice aqui por el ejercicio pero aun no veo con claridad en que casos las interfaces sean mejor eleccion que las clases abstractas, me siento muy limitado en la interfaz  mientas que en la clase es mas amplio
     * 2 Punto de taller, creamos 2 comportamientos abstractos de la nave
     */
    public void assemble();
    public void turnON();


}
