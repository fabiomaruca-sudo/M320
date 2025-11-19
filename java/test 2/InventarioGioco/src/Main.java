//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario("Ayla", 20.0); // max 20 kg

        Item spada = new Item("Spada di Ferro", "arma", "Comune", 1, false, 5.0);
        Item scudo = new Item("Scudo di Legno", "armatura", "Comune", 1, false, 4.0);
        Item pozione = new Item("Pozione", "pozione", "Comune", 3, false, 0.5);
        Item arco = new Item("Arco Lungo", "arma", "Raro", 1, false, 3.0);
        Item elisir = new Item("Elisir", "pozione", "Raro", 1, false, 0.8);

        inv.aggiungi(spada);
        inv.aggiungi(scudo);
        inv.aggiungi(pozione);
        inv.aggiungi(arco);
        inv.aggiungi(elisir);

        inv.elenca();

    }
}