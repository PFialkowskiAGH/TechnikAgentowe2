import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.OneShotBehaviour;

public class klasa_7 extends Agent {
    protected void setup() {
        System.out.println("startuję");
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("pierwsze");
            }
        });
        addBehaviour(new Behaviour(this) {
            private int step = 0;

            public void action() {
                switch(step) {
                    case 0:
                        System.out.println("pierwszy krok");
                        // Dodanie drugiego zachowania
                        addBehaviour(new OneShotBehaviour() {
                            public void action() {
                                System.out.println("drugie");
                            }
                        });
                        step++;
                        break;
                    case 1:
                        System.out.println("drugi krok");
                        step++;
                        break;
                    case 2:
                        System.out.println("trzeci krok");
                        step++;
                        break;
                    case 3:
                        System.out.println("zaraz się usunę");
                        myAgent.removeBehaviour(this);
                        myAgent.doDelete();
                        break;
                }
            }
            public boolean done() {
                return step == 3;
            }
        });
    }
}