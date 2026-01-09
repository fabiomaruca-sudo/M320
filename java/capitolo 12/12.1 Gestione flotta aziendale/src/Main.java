import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Veicolo> flotta = new ArrayList<>();

        Automobile a1 = new Automobile("TI-120", "Toyota", 199.5d, 10.0d);
        Camion c1 = new Camion("GR-9000", "Mercedes", 500.75d, 30.5d);

        flotta.add(a1);
        flotta.add(c1);
        for (Veicolo v : flotta) {
            System.out.println(v.modello + " " + v.targa);
            System.out.println(v.calcolaAutonomia() + "L");
        }
    }
}