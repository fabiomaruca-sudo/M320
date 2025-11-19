import javax.print.DocFlavor;

public class Robot {
    private String nome;
    private String funzione;
    private int annoProduzione;
    private boolean attivo;
    private boolean manutenzione;

    //GETTER e SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFunzione() {
        return funzione;
    }

    public void setFunzione(String funzione) {
        this.funzione = funzione;
    }

    public int getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(int annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public boolean isManutenzione() {
        return manutenzione;
    }

    public void setManutenzione(boolean manutenzione) {
        this.manutenzione = manutenzione;
    }


    //COSTRUTTORI

    //costruttore con parametri
    public Robot(boolean attivo, int annoProduzione, String funzione, String nome, boolean manutenzione) {
        this.attivo = attivo;
        this.annoProduzione = annoProduzione;
        this.funzione = funzione;
        this.nome = nome;
        this.manutenzione = manutenzione;
    }

    //costruttore overloading
    public Robot(int annoProduzione, String funzione, String nome) {
        this.attivo = true;
        this.annoProduzione = annoProduzione;
        this.funzione = funzione;
        this.nome = nome;
        this.manutenzione = false;
    }

    //costruttore di default
    public Robot() {
        this.attivo = true;
        this.annoProduzione = 2009;
        this.funzione = "milizia";
        this.nome = "BT-7274";
        this.manutenzione = false;
    }


    //METODI

    //attiva un robot
    public void attiva() {
        this.attivo = true;
    }

    //disattiva un robot
    public void disattiva() {
        this.attivo = false;
    }

    //imposta un robot in manutenzione
    public boolean inManutenzione() {
        if (manutenzione) {
            manutenzione = false;
            return false;
        }
        manutenzione = true;
        return true;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nome='" + nome + '\'' +
                ", funzione='" + funzione + '\'' +
                ", annoProduzione=" + annoProduzione +
                ", attivo=" + attivo +
                ", manutenzione=" + manutenzione +
                '}';
    }
}
