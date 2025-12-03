import Musica.Brano;
import Musica.Playlist;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Brano br1 = new Brano("Fratelli d'Italia", "Boh");
        Brano br2 = new Brano("Lùmiere", "Gustave");
        Brano br3 = new Brano("Bones", "Imagine Dragons");

        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.addBrano(br1);
        playlist1.addBrano(br2);
        playlist1.addBrano(br3);

        Player Ilettore = new Player("MP3 Reader", "Apple", playlist1);
        Ilettore.Play();
        Ilettore.Precedente();
        Ilettore.selezionaBrano(10);
        Ilettore.selezionaBrano(1);

    }
}