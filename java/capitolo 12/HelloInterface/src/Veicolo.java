public abstract class Veicolo {
    protected String modello;

    public Veicolo(String modello) {
        this.modello = modello;
    }

    abstract void guida();
}
