import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class klasa_8 extends Agent {
    protected void setup() {
        System.out.println("startuję");
        addBehaviour(new TickerBehaviour(this, 2000) {
            protected void onTick() {
                System.out.println("mały tick");
            }
        });
        Behaviour bigTick = new TickerBehaviour(this, 5000) {
            protected void onTick() {
                System.out.println("duży tick");
            }
        };
        addBehaviour(bigTick);
        addBehaviour(new WakerBehaviour(this, 50000) {
            protected void handleElapsedTimeout() {
                myAgent.removeBehaviour(bigTick);
            }
        });
        addBehaviour(new WakerBehaviour(this, 100000) {
            protected void handleElapsedTimeout() {
                myAgent.doDelete();
            }
        });
    }
}