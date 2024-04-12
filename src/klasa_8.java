import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;

public class klasa_8 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                // Tworzymy obiekt Scanner do pobrania danych od użytkownika
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj odległość w kilometrach: ");
                double distanceInKilometers = scanner.nextDouble();

                // Przeliczamy na mile lądowe (1 kilometr = 0.621371 mile)
                double landMiles = distanceInKilometers * 0.621371;
                System.out.println("Odległość w milach lądowych: " + landMiles);

                // Przeliczamy na mile morskie (1 kilometr = 0.539957 mile)
                double nauticalMiles = distanceInKilometers * 0.539957;
                System.out.println("Odległość w milach morskich: " + nauticalMiles);
            }
        });

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("zaraz się usunę");
                myAgent.doDelete();
            }
        });
    }
}
