import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class klasa_5 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj zdanie: ");
                String sentence = scanner.nextLine();
                String[] words = sentence.split("\\s+");
                Map<String, Integer> wordCountMap = new HashMap<>();

                for (String word : words) {
                    if (!wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, 1);
                    } else {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    }
                }
                System.out.println("Liczba wystąpień poszczególnych wyrazów:");
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
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