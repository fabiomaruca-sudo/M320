public class Studente {
    public String nome;
    public int eta;
    public String corso;
    public boolean isPromosso;

    public Studente(String nome, int eta, String corso) {
        this.nome = nome;
        this.eta = eta;
        this.corso = corso;
        this.isPromosso = isPromosso;
    }

    public void saluta() {
        System.out.println("Ciao " + nome +" " + corso);
    }

    public void promosso(boolean isPromosso) {
        this.isPromosso = isPromosso;
        if (isPromosso) {
            System.out.println(nome + " è promosso");
        }else {
            System.out.println(nome + " è bocciato");
        }
    }
}
