import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;

public class klasa_6 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj liczbę całkowitą: ");
                int number = scanner.nextInt();
                boolean isPrime = checkPrime(number);
                if (isPrime) {
                    System.out.println(number + " jest liczbą pierwszą.");
                } else {
                    System.out.println(number + " nie jest liczbą pierwszą.");
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

    private static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
