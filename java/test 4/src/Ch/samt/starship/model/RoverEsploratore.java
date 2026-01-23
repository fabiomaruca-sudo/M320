/**
 * Rover Esploratore
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.model;

import Ch.samt.starship.data.ComponenteMarte;
import Ch.samt.starship.data.Trasmettitore;

public class RoverEsploratore extends ComponenteMarte implements Trasmettitore {
    public RoverEsploratore(String id, int livelloOssigeno, Astronauta responsabile) {
        super(id, livelloOssigeno, responsabile);
    }

    @Override
    public void manutenzione() {
        System.out.println(getId()+" effettua il controllo dei motori e ruote...");
    }

    @Override
    public void sintonizza(double frequenza) throws IllegalArgumentException {
        if (frequenza < 0) {
            throw new IllegalArgumentException();
        }
        if (frequenza == FREQUENZA) {
            System.out.println("Frequenza "+FREQUENZA+" trovata e sintonizzata");
        }
    }

    @Override
    public void inviaSegnale(String segnale) {
        if (getLivelloOssigeno() < 10) {
            throw new IllegalStateException("Ossigeno troppo basso! Almeno il 10%");
        }
        System.out.println("Il rover "+getId()+" manda: "+segnale+". Frequenza: "+FREQUENZA);
    }

}
