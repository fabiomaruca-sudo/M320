public abstract class Personaggio {
    protected String nome;
    protected int puntiVita;

    public Personaggio(String nome, int puntiVita) {
        this.nome = nome;
        this.puntiVita = puntiVita;
    }

    public void stampaStato() {
        System.out.println(nome + "'s HP: " + puntiVita);
    }

    abstract void attacca();
}
