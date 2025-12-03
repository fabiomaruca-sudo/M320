package Musica;

public class Brano {
    private String titolo;
    private String autore;

    //COSTRUTTORE

    public Brano(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    //GETTER E SETTER

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
}
