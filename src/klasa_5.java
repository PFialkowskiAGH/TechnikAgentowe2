import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import java.util.Scanner;

public class klasa_5 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        // Dodanie zachowania do pobierania liczby z klawiatury
        addBehaviour(new GetUserInputBehaviour());
    }

    // Zachowanie do pobierania liczby z klawiatury
    private class GetUserInputBehaviour extends Behaviour {
        private boolean finished = false;

        public void action() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę całkowitą: ");
            int number = scanner.nextInt();

            if (number < 0) {
                // Jeśli użytkownik podał liczbę ujemną, zakończ zachowanie
                System.out.println("Podano liczbę ujemną. Kończę zachowanie.");
                finished = true;
            } else {
                System.out.println("Podano liczbę: " + number);
            }
        }

        public boolean done() {
            return finished;
        }
    }
}