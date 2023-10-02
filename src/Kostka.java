import java.util.Random;
import java.util.Scanner;

public class Kostka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("cześć, ile ścianek ma kostka?");
        int iscian = scanner.nextInt();

        System.out.println("Rzucam kostką o ilości ścianek: "+iscian);
        Random random = new Random();
        int liczWylos = random.nextInt(0, iscian);
        System.out.println("Wyszło mi: " +liczWylos);
    }
}
