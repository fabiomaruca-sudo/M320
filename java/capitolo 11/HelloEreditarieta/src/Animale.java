
//SUPERCLASSE
public class Animale {
    //attributi comuni
    protected String colore;
    protected float peso;
    protected int anni;

    //COSTRUTTORE

    public Animale(String colore, float peso, int anni) {
        this.colore = colore;
        this.peso = peso;
        this.anni = anni;
    }

    //METODI COMUNI

    public void mangia() {
        System.out.println("Mangia");
    }

    public void dormi() {
        System.out.println("Dorme");
    }

    public void emettiVerso() {
        System.out.println("Emette verso");
    }

    public void esegueMovimento() {
        System.out.println("Si sposta");
    }

    @Override
    public String toString() {
        return "Animale{" +
                "colore='" + colore + '\'' +
                ", peso=" + peso +
                ", anni=" + anni +
                '}';
    }
}
