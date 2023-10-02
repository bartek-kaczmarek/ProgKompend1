import java.sql.Struct;
import java.util.Scanner;

public class Warunkowe {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba>0){
            System.out.println("Dodatnia");
        }
        if (liczba==0){
            System.out.println("zero");
        }
        if (liczba<0){
            System.out.println("ujemna");
        }
    }
}
