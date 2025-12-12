import Dipendenti.Dipendente;
import Dipendenti.Dirigente;
import Dipendenti.Tecnico;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Dipendente> personale = new ArrayList<Dipendente>();

        Tecnico tec1 = new Tecnico("Carlo Bello", 156, 2500,50, 5 );
        Tecnico tec2 = new Tecnico("Gianfranco Crucco", 210, 3800,100, 0);

        Dirigente dir1 = new Dirigente("Ruggero Pentola", 100, 2100,30, 300);
        Dirigente dir2 = new Dirigente("Astolfo Biennio", 327, 10000,500, 2000);

        personale.add(tec1);
        personale.add(dir1);
        personale.add(tec2);
        personale.add(dir2);

        for (int i = 0; i < personale.size(); i++) {
            System.out.println((i+1) + ". " + personale.get(i).getMatricola() + " " + personale.get(i).getNome() + " " + personale.get(i).getClass().getSimpleName());
        }
    }
}