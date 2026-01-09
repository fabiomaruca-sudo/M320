public class FrigoriferoSmart extends Elettrodomestico implements Smart {

    public FrigoriferoSmart(String marca, double potenza) {
        super(marca, potenza);
    }

    @Override
    void eseguiCiclo() {
        System.out.println("Frigorifero " + marca + " è stato usato");
    }

    @Override
    public void connettiAlCloud() {
        System.out.println("Frigorifero " + marca + " connesso al cloud");
    }
}
