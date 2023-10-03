import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int pkt = 0;
    static int szansa = 3;

    static boolean odpowiedzNaPytanie(String[] pytanie) {

        System.out.println(pytanie[0]);

        String odp = scanner.next().toUpperCase();
        String prawodp;

        prawodp = pytanie[1];
        prawodp = prawodp.toUpperCase();

        if (odp.contains(prawodp)) {
            System.out.println("Odpowiedź prawidłowa - " + pytanie[1]);
            pkt = pkt + 1;

        } else {
            System.out.println("WRONG");
            szansa = szansa-1;
            System.out.println("Masz tylko " + szansa + " szans.");
            return false;
        }
        return true;
    }

    static String[][] uluzPytania() {

        //  String[] pyt1 = {"Jaka jest stolica Hiszpanii?", "Madryt"};
        //  String[] pyt2 = {"Jaki jest największy ocean?", "Pacyfik"};
        // String[] pyt3 = {"Jaki kolor ma żaba?", "Zielony"};
        // String[] pyt4 = {"Kto rządzi Wlk Brytanią?", "Król"};
        // String[] pyt5 = {"Największa rzeka", "Amazonka"};
        //  String[] pyt6 = {"Satelita Ziemi", "Księżyc"};
        //  String[] pyt7 = {"Gdzie piramida", "Egipt"};
        //  String[] pyt8 = {"Kto rządzi Wlk Brytanią?", "Król"};


        //String[][] pytania = {pyt1, pyt2, pyt3, pyt4,pyt5, pyt6, pyt7, pyt8};

        String[][] pytania = {
                {"Jaka jest stolica Hiszpanii?", "Madryt"},
                {"Jaki jest największy ocean?", "Pacyfik"},
                {"Kto rządzi Wlk Brytanią?", "Król"},
                {"Jaki kolor ma żaba?", "Zielony"},
                {"Największa rzeka", "Amazonka"},
                {"Satelita Ziemi", "Księżyc"},
                {"Gdzie piramida", "Egipt"},
                {"Kto rządzi Wlk Brytanią?", "Król"}
        };

        return pytania;
    }

    ;

    public static void main(String[] args) {

        String[][] pytania = uluzPytania();

        int wybor;
        boolean czyGra = true;
        Random random = new Random();


        do {

            System.out.println("Do you want to play a game? Możesz się pomylić " +szansa +" razy");
            System.out.println("1. TAK");
            System.out.println("2. NIE");
            wybor = scanner.nextInt();
            if (wybor == 2) {
                czyGra = false;
                break;


            } else {
                System.out.println("Na ile rund masz sił?");
                wybor = scanner.nextInt();
            }
            for (int i = 0; i < wybor; i++) {
                int nrpyt = random.nextInt(pytania.length);
                String[] aktpyt = pytania[nrpyt];

                System.out.println("***********");
                System.out.println("Pytanie nr " + (i+1));

                czyGra = odpowiedzNaPytanie(aktpyt);


                if (szansa==0) {
                    czyGra = false;
                    break;
                } else {
                    System.out.println("Masz już " + pkt + " punktów.");
                    czyGra = false;
                }

            }

        } while (czyGra);

        System.out.println("KONIEC GRY. Twój wynik to " + pkt);

    }
}
