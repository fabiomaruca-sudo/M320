public class Item {
    public String nome;
    public String tipo;      // es. "pozione", "arma", "armatura"
    public String rarity;    // "Comune", "Raro", "Epico"
    public int quantita;
    public boolean equipaggiato;
    public double peso;      // peso unitario di UN singolo oggetto

    String usabili[] = {"pozione", "munizione", "cibo"};
    String equipaggiabili[] = {"armatura", "arma"};

    // costruttori
    // con argomenti
    public Item(String nome, String tipo, String rarity, int quantita, boolean equipaggiato, double peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.rarity = rarity;
        this.quantita = quantita;
        this.equipaggiato = equipaggiato;
        this.peso = peso;
    }

    //overloading
    public Item(String nome, String tipo, String rarity, double peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.rarity = rarity;
        this.quantita = 1;
        this.equipaggiato = false;
        this.peso = peso;
    }

    //vuoto
    public Item() {
        this.nome = "spada";
        this.tipo = "arma";
        this.rarity = "Comune";
        this.quantita = 1;
        this.equipaggiato = false;
        this.peso = 5.0;
    }

    //metodi
    public void usa() {
        if (this.quantita > 0) { // controlla se l'oggetto è presente
            for (String tipologia : usabili) { //controllo tipo di oggetto
                if (this.tipo.equals(tipologia)) {
                    this.quantita -= 1;
                    System.out.println("Oggetto "+this.nome+" usato con successo");
                    return;
                }
            }
            System.out.println("Oggetto non consumabile! tipo: " + this.tipo);
        }else {
            System.out.println("Oggetto non presente nell'inventario!");
        }
    }

    void equipaggia() {
        if (this.quantita > 0) { // controlla se l'oggetto è presente
            for (String tipologia : equipaggiabili) { //controllo tipo di oggetto
                if (this.tipo.equals(tipologia)) {
                    if (this.equipaggiato) { //controlla se l'oggetto è già equipaggiato
                        System.out.println("oggetto " + this.nome + " già equipaggiato");
                        return;
                    } else {
                        equipaggiato = true;
                        System.out.println("oggetto " + this.nome + " equipaggiato con successo");
                        return;
                    }
                }
            }
            System.out.println("Oggetto non equipaggiabile! tipo: " + this.tipo);
        }else {
            System.out.println("Oggetto non presente nell'inventario!");
        }
    }

    void disequipaggia() {
        if (this.quantita > 0) { // controlla se l'oggetto è presente
            for (String tipologia : equipaggiabili) { //controllo tipo di oggetto
                if (this.tipo.equals(tipologia)) {
                    if (!this.equipaggiato) { //controlla se l'oggetto non è disequipaggiato
                        System.out.println("oggetto " + this.nome + " non equipaggiato");
                        return;
                    } else {
                        equipaggiato = false;
                        System.out.println("oggetto " + this.nome + " disequipaggiato con successo");
                        return;
                    }
                }
            }
            System.out.println("Oggetto non equipaggiabile! tipo: " + this.tipo);
        }else {
            System.out.println("Oggetto non presente nell'inventario!");
        }
    }

    public boolean isConsumabile() {
        for (String tipologia : usabili) {
            if (this.tipo.equals(tipologia)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEquipaggiabile() {
        for (String tipologia : equipaggiabili) {
            if (this.tipo.equals(tipologia)) {
                return true;
            }
        }
        return false;
    }

    public double pesoTotale() {
        return this.quantita * this.peso;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", rarity='" + rarity + '\'' +
                ", quantita=" + quantita +
                ", equipaggiato=" + equipaggiato +
                ", peso=" + peso +
                '}';
    }
}
