public class DefibrillatoreSmart extends MacchinarioDiagnostico
implements Emergenza {

    public DefibrillatoreSmart(String codiceSeriale, int annoInstallazione) {
        super(codiceSeriale, annoInstallazione);
    }

    @Override
    void eseguiScansione() {
        System.out.println("Analizzando frequenza cardiaca");
    }

    @Override
    public void inviaAllarme(String msg) {
        System.out.println("ALLARME PRIORITÀ " + PRIORITA_MASSIMA + ": " + msg);
    }
}
