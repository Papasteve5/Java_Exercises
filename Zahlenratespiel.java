import java.util.Scanner;
import java.lang.Math;

public class Zahlenratespiel {

    static void regeln() {

        /*Spielregeln*/
        System.out.println("\nZahlen Rate Spiel\n");

        System.out.println("SPIELREGELN");
        System.out.println("*----------------------------------------------------------------*");
        System.out.println("| Rate eine Zahl, welche du für richtig empfindest               |");
        System.out.println("| Falls richtig Gratulation, falls falsch bekommst du eine Hilfe |");
        System.out.println("| Am Schluss zeigt es die Anzahl Versuche                        |");
        System.out.println("|                                                                |");
        System.out.println("| WICHTIG : Es muss eine positive, ganze Zahl sein               |");
        System.out.println("*----------------------------------------------------------------*");
    }

    static void ratespiel() {

        /*Random Zahl generieren*/
        int random;
        random = (int)(Math.random() * 101);

        /*Eingabe*/
        Scanner input = new Scanner(System.in);
        int guess;
        int tries = 1;

        /*Loop*/
        do {
            System.out.println("Geben Sie eine Zahl ein: ");
            guess = input.nextInt();

            if (guess == random) {
                System.out.println("GRATULATION");
                System.out.println("Du hast " + tries + " Versuche gebraucht!");

            } else if (guess < random) {
                System.out.println("Die Zahl ist höher");
                tries = tries + 1;

            } else if (guess > random) {
                System.out.println("Die Zahl ist tiefer");
                tries = tries + 1;
            }
        } while (guess != random);
    }

    public static void main(String[] args) {
        regeln();
        ratespiel();
    }
}
