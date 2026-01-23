/**
 * Base spaziale per immagazzinare componenti su marte
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.model;

import Ch.samt.starship.data.ComponenteMarte;

import java.util.ArrayList;

public class BaseSpaziale {
    private String nome;
    private ArrayList<ComponenteMarte> componenti;

    //COSTRUTTORE
    public BaseSpaziale(String nome) {
        this.nome = nome;
        this.componenti = new ArrayList<ComponenteMarte>();
    }

    //GETTER
    public String getNome() {
        return nome;
    }

    public ArrayList<ComponenteMarte> getComponenti() {
        return componenti;
    }

    //METODI

    //esegue tutte le manutenzioni dei vari componenti
    public void eseguiManutenzione(){
        for ( ComponenteMarte componente : componenti ) {
            System.out.println("Componente "+componente.getId()+" con ossigeno: "+ componente.getLivelloOssigeno()
                    +". "+componente.getResponsabile()+" (responsabile)");
            componente.manutenzione();
        }
    }
}
