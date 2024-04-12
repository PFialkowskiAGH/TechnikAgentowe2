import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import java.util.Arrays;

public class klasa_3 extends Agent {
    protected void setup() {
        System.out.println("startuję");

        // Tablica z 11 dowolnymi liczbami
        int[] tablica = {10, 5, 7, 8, 3, 15, 20, 6, 9, 12, 4};

        // Wyświetlenie tablicy
        System.out.println("Tablica liczb:");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }
        System.out.println();

        int[] kopiaTablicy = Arrays.copyOf(tablica, tablica.length);
        Arrays.sort(kopiaTablicy);

        int pierwszaNajwieksza = kopiaTablicy[kopiaTablicy.length - 1];
        int drugaNajwieksza = kopiaTablicy[kopiaTablicy.length - 2];
        System.out.println("Pierwsza największa wartość: " + pierwszaNajwieksza);
        System.out.println("Druga największa wartość: " + drugaNajwieksza);

        addBehaviour(new OneShotBehaviour() {
            public void action() {
                System.out.println("zaraz się usunę");
                myAgent.doDelete();
            }
        });
    }
}

