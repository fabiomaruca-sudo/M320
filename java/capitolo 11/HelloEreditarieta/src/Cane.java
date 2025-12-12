//Cane estente Animale e si specializza
public class Cane extends Animale {
    private Boolean isAddestrato;

    public Cane(String colore, float peso, int anni,  Boolean isAddestrato) {
        super(colore, peso, anni);
        this.isAddestrato = isAddestrato;
    }

    public Boolean getAddestrato() {
        return isAddestrato;
    }

    public void setAddestrato(Boolean addestrato) {
        isAddestrato = addestrato;
    }

    public void riportaOggetto() {
        if (isAddestrato) {
            System.out.println("Il cane di " + anni + " anni riporta un oggetto");
        }
    }

    public void addestra() {
        this.isAddestrato = true;
    }

    @Override
    public void emettiVerso() {
        System.out.println("Bau Bau");
    }
}