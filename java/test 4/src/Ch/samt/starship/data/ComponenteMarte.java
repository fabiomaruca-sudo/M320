/**
 * Componente di marte, superclasse
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.data;

import Ch.samt.starship.model.Astronauta;

import javax.print.DocFlavor;
import java.util.Objects;

public abstract class ComponenteMarte {
    private String id;
    private int livelloOssigeno;
    private Astronauta responsabile;

    //COSTRUTTORE
    public ComponenteMarte(String id, int livelloOssigeno, Astronauta responsabile) {
        this.id = id;
        if (livelloOssigeno < 0 || livelloOssigeno > 100) {
            throw new IllegalArgumentException("Valore di ossigeno non coerente!");
        }
        this.livelloOssigeno = livelloOssigeno;
        this.responsabile = responsabile;
    }

    //GETTER
    public String getId() {
        return id;
    }

    public int getLivelloOssigeno() {
        return livelloOssigeno;
    }

    public Astronauta getResponsabile() {
        return responsabile;
    }

    //METODI
    /**
     * imposta un nuovo livello di ossigeno
     *
     * @param livelloOssigeno il primo addendo
     */
    public void sicurezza(int livelloOssigeno) {
        if (livelloOssigeno >= 0 && livelloOssigeno <= 100) {
            throw new IllegalArgumentException("Valore di ossigeno non coerente!");
        }
        this.livelloOssigeno = livelloOssigeno;
    }

    public abstract void manutenzione();

    //OVERRIDE
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComponenteMarte that = (ComponenteMarte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
