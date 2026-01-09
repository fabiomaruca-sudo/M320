public class Smartphone extends DispositivoMobile implements Ricaricabile {
    private int caricaAttuale;

    public Smartphone(String sistemaOperativo, int caricaAttuale) {
        super(sistemaOperativo);
        this.caricaAttuale = 100;
    }

    @Override
    void usaFotocamera() {
        System.out.println("Fotocamera accesa");
    }

    @Override
    public void ricarica() {
        System.out.println("Smartphone in ricarica");
    }

    @Override
    public void mostraStato() {
        System.out.println("Livello batteria " + caricaAttuale);
    }
}
