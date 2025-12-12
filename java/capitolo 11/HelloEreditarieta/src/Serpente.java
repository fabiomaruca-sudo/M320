public class Serpente extends Animale {
    private Boolean velenoso;

    public Serpente(String colore, float peso, int anni, Boolean velenoso) {
        super(colore, peso, anni);
        this.velenoso = velenoso;
    }

    public Boolean getVelenso() {
        return velenoso;
    }

    public void setVelenso(Boolean addestrato) {
        velenoso = addestrato;
    }

    public void Striscia() {
        System.out.println("Il serpente si muove");
    }

    @Override
    public void emettiVerso() {
        System.out.println("sssssssss");;
    }
}