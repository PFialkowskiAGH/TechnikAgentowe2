import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class klasa_4 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new Behaviour(this) {
            private int step = 0;

            public void action() {
                switch(step) {
                    case 0:
                        System.out.println("pierwszy krok");
                        step++;
                        break;
                    case 1:
                        System.out.println("drugi krok");
                        step++;
                        break;
                    case 2:
                        System.out.println("trzeci krok");
                        myAgent.removeBehaviour(this);
                        break;
                }
            }

            public boolean done() {
                return step == 3;
            }
        });
    }
}