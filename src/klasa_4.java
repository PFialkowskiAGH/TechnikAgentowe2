import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Scanner;

public class klasa_4 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj wyraz lub liczbę: ");
                String input = scanner.nextLine();

                // Odwracamy kolejność liter w wyrazie lub cyfr w liczbie
                String reversed = reverseString(input);

                // Sprawdzamy, czy odwrócony wyraz/liczba jest palindromem
                boolean isPalindrome = checkPalindrome(input, reversed);
                if (isPalindrome) {
                    System.out.println("To jest palindrom.");
                } else {
                    System.out.println("To nie jest palindrom.");
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

    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    private static boolean checkPalindrome(String original, String reversed) {
        return original.equalsIgnoreCase(reversed);
    }
}
