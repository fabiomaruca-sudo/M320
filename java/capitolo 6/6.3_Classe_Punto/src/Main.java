/**
 * Esercizio Esempio in classe
 * Programma che calcola le posizioni di un punto con gli oggetti
 *
 * @author Fabio Maruca
 * @version 08.10.2025
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Punto pt1 = new Punto(3f, 3f);

    System.out.println(pt1.determinaQuadante());
    System.out.println(pt1.calcolaDistanza());

        System.out.println(pt1);

    }
}