import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import java.util.Scanner;

public class klasa_6 extends Agent {
    protected void setup() {
        System.out.println("startuję");
        addBehaviour(new GetUserInputBehaviour());
    }
    private class GetUserInputBehaviour extends Behaviour {
        private boolean finished = false;

        public void action() {
            System.out.println("Zachowanie startuje");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę całkowitą: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Podano liczbę ujemną. Kończę zachowanie.");
                finished = true;
                myAgent.removeBehaviour(this);
            } else {
                System.out.println("Podano liczbę: " + number);
            }
        }
        public boolean done() {
            System.out.println("Zachowanie zakończone");
            return finished;
        }
    }
}