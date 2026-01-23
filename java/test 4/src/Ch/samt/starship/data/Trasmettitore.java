/**
 * Trasmettitore via frequenze, interfaccia
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.data;

public interface Trasmettitore {
    double FREQUENZA = 433.92;

    public void sintonizza(double frequenza);
    public void inviaSegnale(String segnale);
}
