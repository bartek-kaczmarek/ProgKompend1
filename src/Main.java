import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] pyt1 = {"1", "Jaka jest stolica Hiszpanii?", "Madryt"};
        String[] pyt2 = {"2", "Jaki jest największy ocean?", "Pacyfik"};

        String[][] pytania = {pyt1, pyt2};

        Random random = new Random();

        int nrpyt = random.nextInt(pytania.length);
        String[] aktpyt = pytania[nrpyt];
        String odp;
        int pkt=0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Pytanie nr " + aktpyt[0]);
        System.out.println(aktpyt[1]);
        odp = scanner.next();
        if (odp.contains(aktpyt[2])) {
            System.out.println("Odpowiedź prawidłowa - " + odp);
            pkt = pkt + 1;

        } else {
            System.out.println("WRONG");
        }
        System.out.println("Twój wynik to " + pkt);

    }
}