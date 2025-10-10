public class Libro {
    public String titolo;
    public String autore;
    public int annoPubblicazione;
    public boolean disponibile;

    //costruttore vuoto
    Libro() {
        this.titolo = "Il piccolo principe";
        this.autore = "Gustave";
        this.annoPubblicazione = 1990;
        this.disponibile = true;
    }

    //costruttore con parametri
    Libro(String titolo, String autore, int annoPubblicazione, boolean disponibile) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = false;
    }

    public void stampaInfo() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autore: " + autore);
        System.out.println("AnnoPubblicazione: " + annoPubblicazione);
    }

    public void verificaDisponibilita() {
        if (disponibile) {
            System.out.println(titolo + ": Disponibile");
        }else {
            System.out.println(titolo + ": Nessuna disponibilità");
        }
    }
}
