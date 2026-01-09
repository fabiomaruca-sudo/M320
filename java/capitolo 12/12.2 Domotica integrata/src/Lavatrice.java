public class Lavatrice extends Elettrodomestico {

    public Lavatrice(String marca, double potenza) {
        super(marca, potenza);
    }

    @Override
    void eseguiCiclo() {
        System.out.println("Lavatrice " + marca + " è stata usata");
    }
}
