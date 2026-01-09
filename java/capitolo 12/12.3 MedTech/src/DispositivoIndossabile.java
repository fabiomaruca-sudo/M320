public abstract class DispositivoIndossabile {
    private String idPaziente;
    private int livelloBatteria;

    public DispositivoIndossabile(String idPaziente, int livelloBatteria) {
        this.idPaziente = idPaziente;
        if (livelloBatteria > 100 || livelloBatteria < 0) {
            throw new IllegalArgumentException();
        }
        this.livelloBatteria = livelloBatteria;
    }

    abstract void monitoraParametri();
}
