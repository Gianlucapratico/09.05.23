import java.util.List;

public class MainListaNumeri {

    public static void main(String[] args) {
        List<Integer> numeri = ListaNumeri.generaNumeriCasuali(5);
        System.out.println("Numeri ordinati: " + numeri);

        List<Integer> listaInvertita = ListaNumeri.listaInvertita(numeri);
        System.out.println("Lista invertita: " + listaInvertita);

        System.out.print("Numeri in posizioni pari: ");
        ListaNumeri.stampaNumeri(listaInvertita, true);

        System.out.print("Numeri in posizioni dispari: ");
        ListaNumeri.stampaNumeri(listaInvertita, false);
    }

}