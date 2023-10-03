import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Rzutkostka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerChoice;
        int pointsTemp = 0;
        int pointsHard = 0;
        int wynik = 0;
        boolean czyGra = true;
        Random random = new Random();

        do {
            System.out.println("Chcesz rzucić kostką czy spasować?");
            System.out.println("Twój wynik to: " + pointsTemp);
            System.out.println("1. rzucam");
            System.out.println("2. pasuję");
            playerChoice = scanner.nextInt();
            if (playerChoice == 2) {
                czyGra = false;
                break;
            }

            if (pointsTemp < 0) {
                czyGra = false;
            }

            wynik = random.nextInt(1, 7);
            System.out.println("Rzucasz... wypadło " + wynik);
            if (wynik == pointsTemp) {
                pointsHard = pointsTemp;
                pointsTemp = 0;
            }

            if (wynik == 1) {
                System.out.println("Przegrałeś!");
                break;
            } else {
                pointsTemp += wynik;
            }
            if (pointsTemp > 20) {
                czyGra = false;
                break;
            }


        } while (czyGra == true);

        System.out.println("Koniec gry uzbierałeś " + pointsTemp);
    }
}
