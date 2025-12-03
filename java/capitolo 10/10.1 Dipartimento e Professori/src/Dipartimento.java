import java.util.ArrayList;

public class Dipartimento {
    private String nomeDipartimento;
    private ArrayList<Professore> elencoProfessori = new ArrayList<Professore>();

    public Dipartimento(String nomeDipartimento) {
        this.nomeDipartimento = nomeDipartimento;
        ArrayList<Professore> elencoProfessori = new ArrayList<Professore>();
    }

    public void aggiungiProfessore(Professore prof) {
        elencoProfessori.add(prof);
    }

    public void rimuoviProfessore(Professore prof) {
        elencoProfessori.remove(prof);
    }

    public void visualizzaElencoProfessori() {
        int contatore = 1;
        for (Professore prof : elencoProfessori) {
            if (prof == null) {
                System.out.println("Professore non trovato");
            }else {
                System.out.println(contatore + ". " + prof.toString());
                contatore++;
            }
        }
        if (elencoProfessori.size() == 0) {
            System.out.println("Nessun professore trovato");
        }
    }

    public int getNumeroProfessori() {
        return this.elencoProfessori.size();
    }
}
