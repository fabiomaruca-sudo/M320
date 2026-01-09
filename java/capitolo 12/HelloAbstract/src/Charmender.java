public class Charmender extends Pokemon {

    public Charmender(String nome, int livello, int anni) {
        super(nome, livello, anni);
    }

    @Override
    void usaMossaSpeciale() {
        System.out.println(nome + " usa Braciere!");
    }
}
