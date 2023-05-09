
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        this.rubrica = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String telefono) {
        this.rubrica.put(nome, telefono);
    }

    public void rimuoviContatto(String nome) {
        this.rubrica.remove(nome);
    }

    public String trovaNumero(String nome) {
        return this.rubrica.get(nome);
    }

    public String trovaNome(String numero) {
        for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void stampaRubrica() {
        for (Map.Entry<String, String> entry : this.rubrica.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
