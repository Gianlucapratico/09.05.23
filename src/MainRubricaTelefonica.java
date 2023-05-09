
import java.util.Scanner;
public class MainRubricaTelefonica {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner input = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Trova numero da nome");
            System.out.println("4. Trova nome da numero");
            System.out.println("5. Stampa rubrica");
            System.out.println("0. Esci");

            int scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Telefono: ");
                    String telefono = input.next();
                    rubrica.aggiungiContatto(nome, telefono);
                    System.out.println("Contatto aggiunto");
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nomeRim = input.next();
                    rubrica.rimuoviContatto(nomeRim);
                    System.out.println("Contatto rimosso");
                    break;
                case 3:
                    System.out.print("Nome: ");
                    String nomeCerca = input.next();
                    String telefonoCerca = rubrica.trovaNumero(nomeCerca);
                    if (telefonoCerca != null) {
                        System.out.println("Telefono: " + telefonoCerca);
                    } else {
                        System.out.println("Contatto non trovato");
                    }
                    break;
                case 4:
                    System.out.print("Telefono: ");
                    String telefonoCerca2 = input.next();
                    String nomeCerca2 = rubrica.trovaNome(telefonoCerca2);
                    if (nomeCerca2 != null) {
                        System.out.println("Nome: " + nomeCerca2);
                    } else {
                        System.out.println("Contatto non trovato");
                    }
                    break;
                case 5:
                    rubrica.stampaRubrica();
                    break;
                case 0:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
            System.out.println();
        }
    }
}

