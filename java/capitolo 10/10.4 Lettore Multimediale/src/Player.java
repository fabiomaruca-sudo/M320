import Musica.Playlist;

import java.util.ArrayList;

public class Player {
    private String modello;
    private String marca;
    private ArrayList<Playlist> playlist;
    private int playlistCorrente;
    private int branoCorrente;

    //COSTRUTTORE


    public Player(String modello, String marca, Playlist playlist) {
        this.modello = modello;
        this.marca = marca;
        this.playlist = new ArrayList<Playlist>();
        this.playlist.add(playlist);
        branoCorrente = 0;
        playlistCorrente = 0;
    }

    //GETTER E SETTER

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Playlist getPlaylist() {
        return playlist.get(playlistCorrente);
    }

    //METODI

    public void addPlaylist(Playlist playlist) {
        this.playlist.add(playlist);
    }

    public void removePlaylist(Playlist playlist) {
        this.playlist.remove(playlist);
    }

    public void setPlaylistCorrente(int playlistCorrente) {
        this.playlistCorrente = playlistCorrente;
    }

    public Playlist getPlaylistCorrente() {
        return playlist.get(playlistCorrente);
    }

    public void Play() {
        System.out.println("Playing " + getPlaylistCorrente().getBrano(branoCorrente));
    }

    public void Successivo() {
        if (branoCorrente + 1 < getPlaylistCorrente().getLength()) {
            branoCorrente++;
        }else  {
            branoCorrente = 0;
        }
        Play();
    }

    public void Precedente() {
        if (branoCorrente - 1 > 0) {
            branoCorrente--;
        }else  {
            branoCorrente = getPlaylistCorrente().getLength()-1;
        }
        Play();
    }

    public void selezionaBrano (int n) {
        if  (n < getPlaylistCorrente().getLength() && n >= 0) {
            branoCorrente = n;
            Play();
        }
    }
}
