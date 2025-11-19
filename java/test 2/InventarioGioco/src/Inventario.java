public class Inventario {
    String proprietario;
    Item[] slot = new Item[8];   // massimo 8 slot
    double pesoMassimo;          // peso massimo trasportabile

    //costruttori
    //con parametri
    public Inventario(String proprietario, double pesoMassimo) {
        this.proprietario = proprietario;
        this.pesoMassimo = pesoMassimo; // kg o unità di gioco
    }

    //vuoto
    public Inventario() {
        this.proprietario = "Eroe";
        this.pesoMassimo = 50.0; // kg o unità di gioco
    }

    public boolean aggiungi(Item item) { // aggiunge item se non supera pesoMassimo
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] == null) {
                if (canAggiungere(item)) {
                    this.slot[i] = item;
                    System.out.println("Oggetto " + item.nome + " Aggiunto con successo all'inventario di " + proprietario);
                    return true;
                }
                System.out.println("Stai superando il peso massimo! prima alleggerire l'inventario");
            }
        }
        System.out.println("Inventario pieno! prima di aggiungere un altro oggetto svuotare almeno uno slot");
        return false;
    }

    public boolean rimuovi(String nome) { // rimuove primo item con quel nome
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] != null) {
                if (this.slot[i].nome.equals(nome)) {
                    System.out.println("Oggetto "+this.slot[i].nome+" rimosso con successo");
                    this.slot[i] = null;
                    return true;
                }
            }
        }
        System.out.println("Oggetto non trovato!");
        return false;
    }

    public Item cerca(String nome) {
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] != null) {
                if (this.slot[i].nome.equals(nome)) {
                    System.out.println("Oggetto "+this.slot[i].nome+" trovato alla posizione "+i);
                    return this.slot[i];
                }
            }
        }
        System.out.println("Oggetto non trovato!");
        return null;
    }

    public void equipaggia(String nome) {
        Item oggetto = cerca(nome);
        if (oggetto != null) {
            oggetto.equipaggia();
        }
    }

    public void disequipaggia(String nome) {
        Item oggetto = cerca(nome);
        if (oggetto != null) {
            oggetto.disequipaggia();
        }
    }

    public int contaPerRarity(String rarity) {
        int contaRarity = 0;
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] != null) {
                if (rarity.equals(this.slot[i].rarity)){
                    contaRarity++;
                }
            }
        }
        return contaRarity;
    }

    public double pesoTotale() {
        double peso = 0;
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] != null) {
                peso += this.slot[i].peso*this.slot[i].quantita;
            }
        }
        return peso;
    }

    public boolean canAggiungere(Item item) {
        return pesoTotale() + item.peso*item.quantita < pesoMassimo;
    }

    public void rimuoviTutto(String nome) {
        Item oggetto = cerca(nome);
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] != null) {
                if (this.slot[i].nome.equals(nome)) {
                    this.slot[i] = null;
                }
            }
        }
    }

    public void svuotaInventario() {
        for (int i = 0; i < slot.length; i++) {
            this.slot = null;
        }
    }

    public Item cercaPeso(double peso) {
        for (int i = 0; i < slot.length; i++) {
            if (this.slot[i] != null) {
                if (this.slot[i].peso == peso) {
                    return this.slot[i];
                }
            }
        }
        return null;
    }

    public void elenca() {
        double numMinore;
        double valMomentaneo;
        int pos = 0;
        for (int i = 0; i < this.slot.length; i++) {
            if (this.slot[i] != null) {
                numMinore = this.slot[i].peso;
                valMomentaneo = this.slot[i].peso;
                pos = i;
                for (int j = i; j < slot.length; j++) {
                    if (this.slot[j] != null) {
                        if (this.slot[j].peso < numMinore) {
                            valMomentaneo = numMinore;
                            numMinore = this.slot[j].peso;
                            pos = j;
                        }
                    }
                }
                this.slot[pos] = cercaPeso(valMomentaneo);
                this.slot[i] = cercaPeso(numMinore);
            }
        }

        for(Item e : this.slot) {
            if (e != null) {
                System.out.println("Oggetto "+e.nome+" Peso "+e.peso+" Quantità "+e.quantita);
            }
        }
    }
}
