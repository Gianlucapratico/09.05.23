
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListaNumeri {

    public static List<Integer> generaNumeriCasuali(int N) {
        List<Integer> numeri = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            numeri.add(rand.nextInt(101));
        }
        Collections.sort(numeri);
        return numeri;
    }

    public static List<Integer> listaInvertita(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        lista.addAll(listaInvertita);
        return lista;
    }

    public static void stampaNumeri(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.print(lista.get(i) + " ");
            } else if (!pari && i % 2 == 1) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

}

