/**
 * Antenna parabolica
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.model;

import Ch.samt.starship.data.ComponenteMarte;
import Ch.samt.starship.data.Trasmettitore;

public class AntennaParabolica extends ComponenteMarte implements Trasmettitore {
    public AntennaParabolica(String id, int livelloOssigeno, Astronauta responsabile) {
        super(id, livelloOssigeno, responsabile);
    }

    @Override
    public void manutenzione() {
        System.out.println(getId()+" ricalibra l'antenna...");
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
        System.out.println(segnale+". Frequenza di destinazione: "+FREQUENZA);
    }
}
