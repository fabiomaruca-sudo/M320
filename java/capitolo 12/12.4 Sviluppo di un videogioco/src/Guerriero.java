public class Guerriero extends Personaggio
implements Armato {

    public Guerriero(String nome, int puntiVita) {
        super(nome, puntiVita);
    }

    @Override
    public void usaArma() {
        System.out.println(nome + " carica il bersaglio! (Guerriero)");
    }

    @Override
    void attacca() {
        System.out.println(nome + " attacca! (Guerriero)");
    }
}
