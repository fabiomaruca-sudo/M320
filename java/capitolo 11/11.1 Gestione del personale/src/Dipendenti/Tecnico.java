package Dipendenti;

public class Tecnico extends Dipendente {
    private int oreStraordinario;

    public Tecnico(String nome, int matricola, double salarioBase, double pagaOraria, int oreStraordinario) {
        super(nome, matricola, salarioBase, pagaOraria);
        this.oreStraordinario = oreStraordinario;
    }

    public int getOreStraordinario() {
        return oreStraordinario;
    }

    public void setOreStraordinario(int oreStraordinario) {
        this.oreStraordinario = oreStraordinario;
    }

    @Override
    public double calcolaStipendio() {
        return salarioBase + (pagaOraria * oreStraordinario);
    }
}
