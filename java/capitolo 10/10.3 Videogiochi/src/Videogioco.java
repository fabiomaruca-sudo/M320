import java.util.ArrayList;
import java.util.List;

public class Videogioco {
    private String titolo;
    private ArrayList<Sviluppatore> sviluppatori;
    private float prezzo;
    private boolean stato;

    //COSTRUTTORI

    public Videogioco(String titolo, float prezzo, boolean stato) {
        this.titolo = titolo;
        this.sviluppatori = new ArrayList<Sviluppatore>();
        this.prezzo = prezzo;
        this.stato = stato;
    }

    //METODI

    public void aggiungiSviluppatore(Sviluppatore sv) {
        this.sviluppatori.add(sv);
    }

    public void rimuoviSviluppatore(Sviluppatore sv) {
        this.sviluppatori.remove(sv);
    }
}
