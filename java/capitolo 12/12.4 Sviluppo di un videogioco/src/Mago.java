public class Mago extends Personaggio
implements Magico {
    public Mago(String nome, int puntiVita) {
        super(nome, puntiVita);
    }

    @Override
    public void lanciaIncantesimo() {
        System.out.println(nome + " usa Black Blizzard! (Mago)");
    }

    @Override
    void attacca() {
        System.out.println(nome + " lancia una palla di fuoco! (Mago)");
    }
}
