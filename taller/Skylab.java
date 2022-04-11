package taller;
/**
 * @author Justin Alejandro Diaz Jimenez
 * Creamos un tipo de nave, en este caso Skylab que extiende de Spacecraft como molde y hereda los comportamientos implementando los protocolos
 */
public class Skylab extends Spacecraft implements Protocols {
    /**
     * Como esta nave depende de la orbita creamos este atributo, es un satelite
     */
    public String orbit;

    /**
     * Inicializamos todas las variables como buenas practicas
     *
     *
     */
    public Skylab() {
        this.orbit = "435 Km";
        setPower("No described in article");
        setWeight("77 Tons");
        setPurpose("To function as a major space research center in Earth orbit.");
        setCategory("Manned Spacecraft");
        setFuelType("Solid Fuel");
        /**
         * firmamos el contrato de que nuestra nave debe ejecutar estos comportamientos
         */
        assemble();
        turnON();
    }

    /**
     * Hacemos sobreescritura de metodos como se solicito en el taller
     * en este caso tenemos el metodo asemble que ensambla la nave
     * debajo tenemos el metodo TurnON que enciende la nave y la deja lista para el viaje
     */
    @Override
    public void assemble() {
        /**
         * Le mostramos al usuario las especificaciones de su nave
         */
        System.out.println("Your spaceship is being created..");
        wait(1500);
        System.out.println("___________________________");

        System.out.println("Your ship specifications:");
        System.out.println("Name: Skylab");
        System.out.println("Orbit: "+ orbit);
        System.out.println("Purpose: "+ getPurpose());
        System.out.println("Category: "+ getCategory());
        System.out.println("Power: "+ getPower());
        System.out.println("Weight "+ getWeight());
        System.out.println("Fuel: "+ getFuelType());

    }

    @Override
    public void turnON() {
        System.out.println("___________________________");
        wait(1500);
        System.out.println("Your Spacecraft is now ON and Ready to the mission");



    }
}
