import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AutoElettrica ae1 = new AutoElettrica("Ford");
        Smartphone s1 = new Smartphone("Linux", 100);

        //Esempio polimorfismo con interfaccia

        ArrayList<Ricaricabile> ricaricabili = new ArrayList<Ricaricabile>();
        ricaricabili.add(ae1);
        ricaricabili.add(s1);

        for (Ricaricabile r : ricaricabili) {
            r.ricarica();
            r.mostraStato();
        }
    }
}