public abstract class DispositivoSicurezza {
    protected String idCodice;
    protected int livelloRischi;

    public DispositivoSicurezza(String idCodice, int livelloRischi) {
        this.idCodice = idCodice;
        this.livelloRischi = livelloRischi;
    }

    abstract void allarme();
}
