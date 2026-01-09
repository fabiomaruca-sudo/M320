abstract class Pokemon {
    protected String nome;
    protected int livello;
    protected int anni;

    public Pokemon(String nome, int livello, int anni) {
        this.nome = nome;
        this.livello = livello;
        this.anni = anni;
    }

    //Metodo completo con implementazione
    public void mangia() {
        System.out.println("Mangia una bacca");
    }

    //Metodo astratto deve essere senza implementazione
    abstract void usaMossaSpeciale();
}
