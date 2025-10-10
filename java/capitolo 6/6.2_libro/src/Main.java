//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Esercizio Esempio in classe
 * Programma che mostra informazioni dei libri con gli oggetti
 *
 * @author Fabio Maruca
 * @version 08.10.2025
 */
public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("10 piccoli indiani", "Pablo", 2010, true);

        l1.stampaInfo();
        l2.stampaInfo();
        l1.verificaDisponibilita();
        l2.verificaDisponibilita();
    }
}