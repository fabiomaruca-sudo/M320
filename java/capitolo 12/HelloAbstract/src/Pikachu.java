public class Pikachu extends Pokemon {

    public Pikachu(String nome, int livello, int anni) {
        super(nome, livello, anni);
    }

    @Override
    void usaMossaSpeciale() {
        System.out.println(nome + " usa TuonoShock!");
    }
}
