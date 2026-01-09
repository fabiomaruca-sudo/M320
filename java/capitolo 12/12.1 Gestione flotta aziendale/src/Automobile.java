public class Automobile extends Veicolo {
    private double consumoMedio;

    public Automobile(String targa, String modello, double serbatoioLitri, double consumoMedio) {
        super(targa, modello, serbatoioLitri);
        this.consumoMedio = consumoMedio;
    }

    @Override
    public double calcolaAutonomia() {
        return serbatoioLitri * consumoMedio;
    }

}
