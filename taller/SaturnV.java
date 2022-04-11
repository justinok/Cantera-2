package taller;

/**
 * @author Justin Alejandro Diaz Jimenez
 * Creamos un tipo de nave, en este caso SaturnV que extiende de Spacecraft como molde y hereda los comportamientos implementando los protocolos
 */
public class SaturnV extends Spacecraft implements Protocols {
    /**
     * Creamos una variable especifica para este tipo de nave, para las lanzaderas
     */
    public String loadCapacity;

    /**
     * Inicializamos todas las variables como buenas practicas
     *
     *
     */
    public SaturnV() {
        this.loadCapacity = "118 Tons";
        setPower("3500 Tons of thrust");
        setWeight("2900 Tons");
        setPurpose("Transporting the manned Apollo spacecraft to the moon");
        setCategory("Shuttle");
        setFuelType("Chemical Fuel");
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
        System.out.println("Name: SaturnV");
        System.out.println("Purpose: "+ getPurpose());
        System.out.println("Category: "+ getCategory());
        System.out.println("Load Capacity: "+ loadCapacity);
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
