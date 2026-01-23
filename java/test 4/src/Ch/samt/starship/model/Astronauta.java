/**
 * Astronauta su marte
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.model;

public class Astronauta {
    private String nome;
    private String ruolo;

    //COSTRUTTORE
    public Astronauta(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

    //GETTER
    public String getNome() {
        return nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    //OVERRIDE

    @Override
    public String toString() {
        return "Astronauta: "+nome+" [Ruolo: "+ruolo+"]";
    }
}
