package Dipendenti;

public class Dipendente {
    protected String nome;
    protected int matricola;
    protected double salarioBase;
    protected double pagaOraria;

    public Dipendente(String nome, int matricola, double salarioBase, double pagaOraria) {
        this.nome = nome;
        this.matricola = matricola;
        this.salarioBase = salarioBase;
        this.pagaOraria = pagaOraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public double getPagaOraria() {
        return pagaOraria;
    }

    public void setPagaOraria(double pagaOraria) {
        this.pagaOraria = pagaOraria;
    }

    public double calcolaStipendio() {
        return salarioBase;
    }
}
