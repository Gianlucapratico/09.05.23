
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parole {
    public static void ricercaDuplicati(int N) {
        Scanner input = new Scanner(System.in);

        Set<String> parole = new HashSet<>();
        Set<String> duplicati = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci la parola #" + (i + 1) + ": ");
            String parola = input.next();
            if (!parole.add(parola)) {
                duplicati.add(parola);
            }
        }
        
        System.out.println("Parole duplicate: " + duplicati);
        System.out.println("Numero di parole distinte: " + parole.size());
        System.out.println("Elenco delle parole distinte: " + parole);
    }
}