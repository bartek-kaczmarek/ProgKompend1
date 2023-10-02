import java.util.Random;
import java.util.Scanner;

public class Rzutkostka {
    public static void main(String[] args) {
        int playerChoice = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz rzucić kostką czy spasować?");
        Random random = new Random();
        int wynik = random.nextInt(1, 7);
        System.out.println("");
        System.out.println("Twój wynik to: " + wynik);

        System.out.println("");
        System.out.println("1. rzucam");
        System.out.println("2. pasuję");
        playerChoice = scanner.nextInt();

    }
}
