/**
 * Esercizio Esempio in classe
 * Programma che mostra la funzione delle classi
 *
 * @author Fabio Maruca
 * @version 08.10.2025
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5.5f, 3.5f);
        Rettangolo r2 = new Rettangolo(6.5f, 2.5f);
        Rettangolo r3 = new Rettangolo(7.5f, 1.5f);

        r1.stampaInformazioni();
        r2.stampaInformazioni();
        r3.stampaInformazioni();
    }
}