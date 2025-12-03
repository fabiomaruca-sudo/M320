//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professore profRossi = new Professore("Mario Rossi", "INF/01");
        Professore profVerdi = new Professore("Luigi Verdi", "FIS/02");

        Dipartimento dipInformatica = new Dipartimento("Dipartimento di Informatica");
        dipInformatica.aggiungiProfessore(profRossi);
        dipInformatica.aggiungiProfessore(profVerdi);

        dipInformatica.visualizzaElencoProfessori();
        System.out.println(dipInformatica.getNumeroProfessori());

        dipInformatica.rimuoviProfessore(profRossi);
        dipInformatica.visualizzaElencoProfessori();
    }
}