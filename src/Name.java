import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
String imie = "xx";
        String nazwisko = "xx";
        int wiek = 0;

        System.out.println("Cześć, jak masz na imię?");
        imie = scanner.next();

        System.out.println("Jak masz na nazwisko?");
        nazwisko = scanner.next();

        System.out.println("Cześć"+imie+"Proszę podaj jeszcze swój wiek");

       wiek = scanner.nextInt();
        System.out.println("Już wiem czy jesteś pełnoletni:");
        if (wiek>= 18 ) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
