//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Esercizio Esempio in classe
 * Programma che controlla dati di allievi con oggetti
 *
 * @author Fabio Maruca
 * @version 08.10.2025
 */
public class Main {
    public static void main(String[] args) {
        Studente std1 = new Studente("Carlo", 15, "matematica");
        Studente std2 = new Studente("Marcello", 12, "fisica");

        std1.saluta();
        std2.promosso(false);
        System.out.println(std1);
    }
}