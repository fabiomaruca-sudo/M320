public class SmartwatchPaziente extends DispositivoIndossabile
implements Emergenza {

    public SmartwatchPaziente(String idPaziente, int livelloBatteria) {
        super(idPaziente, livelloBatteria);
    }

    @Override
    void monitoraParametri() {
        System.out.println("Analizzando BPM...");
    }

    @Override
    public void inviaAllarme(String msg) {
        System.out.println("Posizione GPS del paziente " + msg);
    }
}
