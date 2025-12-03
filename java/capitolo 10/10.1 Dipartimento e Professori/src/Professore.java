public class Professore {
    private String nome;
    private String idDocente;//un identificativo unico, es. "MAT/05"

    public Professore(String nome, String idDocente) {
        this.nome = nome;
        this.idDocente = idDocente;
    }

    public String getNome() {
        return nome;
    }

    public String getIdDocente() {
        return idDocente;
    }

    @Override
    public String toString() {
        return "Prof. " +
        nome + "(" + idDocente + ")";
    }
}
