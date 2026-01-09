public abstract class DispositivoMobile {
    protected String sistemaOperativo;

    public DispositivoMobile(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    abstract void usaFotocamera();
}
