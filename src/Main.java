import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerChoice = 1;
        int points = 0;
        int wynik = 0;
        do {
            System.out.println("Chcesz rzucić kostką czy spasować?");
            Random random = new Random();
            wynik = random.nextInt(1, 7);
            System.out.println("Twój wynik to: " + wynik);


            System.out.println("1. rzucam");
            System.out.println("2. pasuję");
            playerChoice = scanner.nextInt();
            if (wynik == 1) {
                System.out.println("Przegrałeś!");
            } else {

                points = points + wynik;
            }
        } while ((points < 20));
        System.out.println("Koniec gry - wygrałeś!");
    }
}
