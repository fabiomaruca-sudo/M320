public abstract class Veicolo {
    protected String targa;
    protected String modello;
    protected double serbatoioLitri;

    public Veicolo(String targa, String modello, double serbatoioLitri) {
        this.targa = targa;
        this.modello = modello;
        this.serbatoioLitri = serbatoioLitri;
    }

    public abstract double calcolaAutonomia();
}
