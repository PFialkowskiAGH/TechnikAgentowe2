import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;

public class klasa_7 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                int height = 10;

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < height - i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i * 2; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
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

