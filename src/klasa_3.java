import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class klasa_3 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        // Dodanie zachowania cyklicznego
        addBehaviour(new CyclicBehaviour(this) {
            public void action() {
                System.out.println("wykonuję");
            }
        });
    }
}