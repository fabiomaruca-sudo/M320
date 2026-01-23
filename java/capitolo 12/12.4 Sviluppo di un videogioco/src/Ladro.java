public class Ladro extends Personaggio {

    public Ladro(String nome, int puntiVita) {
        super(nome, puntiVita);
    }

    @Override
    void attacca() {
        System.out.println(nome + " lancia un coltellino! (Ladro)");
    }
}
