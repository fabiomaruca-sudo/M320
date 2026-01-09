public abstract class MacchinarioDiagnostico {
    private String codiceSeriale;
    private int annoInstallazione;

    public MacchinarioDiagnostico(String codiceSeriale, int annoInstallazione) {
        if (annoInstallazione < 1950 || annoInstallazione > 2026) {
            throw new IllegalArgumentException();
        }
        this.codiceSeriale = codiceSeriale;
        this.annoInstallazione = annoInstallazione;
    }

    abstract void eseguiScansione();
}
