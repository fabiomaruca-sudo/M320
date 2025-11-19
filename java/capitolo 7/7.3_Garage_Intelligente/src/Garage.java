public class Garage {
    public String nome;
    public Automobile[] posti;

    public Garage(String nome, int numeroPosti) {
        this.nome = nome;
        posti = new Automobile[numeroPosti];
    }

    public void aggiungiAuto(Automobile car) {
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] == null) {
                posti[i] = car;
                System.out.println("Automobile " + posti[i].marca + " " + posti[i].modello + " aggiunta correttamente");
                break;
            }
        }
    }

    public void rimuoviAuto(String targa) {
        for (int i = 0; i < posti.length; i++) {
            if (posti[i].targa.equals(targa)) {
                System.out.println("Automobile " + posti[i].marca + " " + posti[i].modello + " targa: " + posti[i].targa + " rimossa correttamente");
                posti[i] = null;
                break;
            }
        }
    }

    public void  mostraAuto() {
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null) {
                System.out.println(i+1 + ". Auto corrente: " + posti[i].marca + " " + posti[i].modello + " targa: " + posti[i].targa);
            } else {
                System.out.println(i+1 + ". Auto corrente: N/A");
            }
        }
    }

    public int contaElettriche() {
        int conta = 0;
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null) {
                if (posti[i].elettrica) {
                    conta++;
                }
            }
        }
        return conta;
    }

    public int contaStoriche() {
        int conta = 0;
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null) {
                if (posti[i].isStorica()) {
                    conta++;
                }
            }
        }
        return conta;
    }

    public int cercaAuto(String targa) {
        int ritorno = -1;
        for (int i = 0; i < posti.length; i++) {
            if (posti[i] != null) {
                if (posti[i].targa.equals(targa)) {
                ritorno = i;
                }
            }
        }
        return ritorno;
    }
}
