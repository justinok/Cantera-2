package taller;
import javax.swing.JOptionPane;
/**
 * @author Justin Alejandro Diaz Jimenez
 * Clase Main para construir naves a voluntad
 */
public class Main {
    public static void main(String[] args){
        Spacecraft spacecraft;
        /**
         * Esta linea crea el cuadro de dialogo para pedirle el numero de nave a construir al usuario
         */
        String x = JOptionPane.showInputDialog("Spacecrafts aviable to build 1.SaturnV 2.Energy Shuttle 3.Pioner XI 4.Skylab ","Write here the number (1,2,3,4) of your desired Spacecraft");

        /**
         * Switch para cambiar entre constructor a deseo de usuario
         */
        switch (x){
            case "1" : {
                spacecraft = new SaturnV();
                System.out.println(spacecraft.getMessage());

                break;
            }
            case "2" : {
                spacecraft = new EnergyShuttle();
                System.out.println(spacecraft.getMessage());
                break;

            }
            case "3" : {
                spacecraft = new PionerXI();
                System.out.println(spacecraft.getMessage());
                break;

            }
            case "4" : {
                spacecraft = new Skylab();
                System.out.println(spacecraft.getMessage());
                break;

            }
            default: {
                System.out.println("Try again with just the number of your desired Spacecraft");
                break;

            }

        }




    }
}
