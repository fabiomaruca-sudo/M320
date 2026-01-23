import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Personaggio> team = new ArrayList<Personaggio>();
        Mago p1 = new Mago("Merlino", 60);
        Guerriero p2 = new Guerriero("Juanito", 130);
        Ladro p3 = new Ladro("Yehor", 100);
        team.add(p1);
        team.add(p2);
        team.add(p3);

        for (Personaggio p : team) {
            p.stampaStato();
            p.attacca();
            if (p.getClass() == Guerriero.class) {
                Guerriero g = (Guerriero) p;
                g.usaArma();
            } if (p.getClass() == Mago.class) {

                Mago m = (Mago) p;
                m.lanciaIncantesimo();
            }
        }
    }
}