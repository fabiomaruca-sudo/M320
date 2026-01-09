public class Telecamera extends DispositivoSicurezza implements Smart {

    public Telecamera(String idCodice, int livelloRischi) {
        super(idCodice, livelloRischi);
    }

    @Override
    void allarme() {
        System.out.println("Telecamera " + idCodice + " suona!");
    }

    @Override
    public void connettiAlCloud() {
        System.out.println("Telecamera " + idCodice + " connessa al cloud");
    }
}
