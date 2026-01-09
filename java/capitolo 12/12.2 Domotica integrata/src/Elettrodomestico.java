public abstract class Elettrodomestico {
    protected String marca;
    protected double potenza;

    public Elettrodomestico(String marca, double potenza) {
        this.marca = marca;
        this.potenza = potenza;
    }

    abstract void eseguiCiclo();
}
