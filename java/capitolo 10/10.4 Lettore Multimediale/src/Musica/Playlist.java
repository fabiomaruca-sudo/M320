package Musica;

import java.util.ArrayList;

public class Playlist {
    private String titolo;
    private ArrayList<Brano> brani;

    //COSTRUTTORE

    public Playlist(String titolo) {
        this.titolo = titolo;
        brani = new ArrayList<>();
    }

    //GETTER E SETTER

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getBrano(int posizione) {
        return brani.get(posizione).getTitolo();
    }

    public int getLength() {
        return brani.size();
    }

    public void addBrano(Brano brani) {
        this.brani.add(brani);
    }

    public void rimuoviBrano(Brano brani) {
        this.brani.remove(brani);
    }

}
