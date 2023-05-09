
import java.util.Scanner;

public class MainParole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di elementi: ");
        int N = input.nextInt();
        
        Parole.ricercaDuplicati(N);
    }
}