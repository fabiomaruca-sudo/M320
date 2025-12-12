package Dipendenti;

public class Dirigente extends Dipendente {
    private double bonusAnnuale;

    public Dirigente(String nome, int matricola, double salarioBase, double pagaOraria, double bonusAnnuale) {
        super(nome, matricola, salarioBase, pagaOraria);
        this.bonusAnnuale = bonusAnnuale;
    }

    public double getBonusAnnuale() {
        return bonusAnnuale;
    }

    public void setBonusAnnuale(double bonusAnnuale) {
        this.bonusAnnuale = bonusAnnuale;
    }

    @Override
    public double calcolaStipendio() {
        return salarioBase + bonusAnnuale;
    }
}
