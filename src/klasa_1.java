import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_1 extends Agent {
    protected void setup() {
        System.out.println("startuję");
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("zaraz się usunę");
                myAgent.doDelete();
            }
        });
    }
}