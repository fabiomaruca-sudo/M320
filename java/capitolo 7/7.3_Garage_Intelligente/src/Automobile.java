import java.time.Year;

public class Automobile {
    public String targa;
    public String marca;
    public String modello;
    public int anno;
    public boolean elettrica;
    public boolean parcheggiata;
    int annoCorrente;// metodo per richiamare anno corrente

    public Automobile(String targa, String marca, String modello, int anno, boolean elettrica) {
        if (targa.isEmpty()) {
            throw new IllegalArgumentException("Targa non valida");
        }
        if (marca.isEmpty()) {
            throw new IllegalArgumentException("Marca non valida");
        }
        if (modello.isEmpty()) {
            throw new IllegalArgumentException("Modello non valida");
        }
        aggiornaAnnoCorrente();
        if (anno < 1893 || anno >= annoCorrente) {
            throw new IllegalArgumentException("Anno non valido");
        }

        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.elettrica = elettrica;
    }

    public void entraGarage() {
        this.parcheggiata = true;
        System.out.println("Auto " + marca + ", targata " + targa + " è parcheggiata");
    }

    public void esciGarage() {
        this.parcheggiata = false;
        System.out.println("Auto " + marca + ", targata " + targa + " è uscita");
    }

    public boolean isStorica() {
        aggiornaAnnoCorrente();
        return annoCorrente - this.anno > 25;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", anno=" + anno +
                ", elettrica=" + elettrica +
                ", parcheggiata=" + parcheggiata +
                '}';
    }

    private void aggiornaAnnoCorrente() {
        annoCorrente = Year.now().getValue();
    }
}
