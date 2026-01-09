public class AutoElettrica extends Veicolo implements Ricaricabile {

    public AutoElettrica(String modello) {
        super(modello);

    }

    //questo sovrascrive il metodo guida ereditato dalla classe veicolo
    @Override
    void guida() {
        System.out.println("Auto elettrica in movimento");
    }

    @Override
    public void ricarica() {
        System.out.println("Ricarica colonnina");
    }

    @Override
    public void mostraStato() {
        System.out.println("Ricarica massima " + LIVELLO_MASSIMO);
    }
}
