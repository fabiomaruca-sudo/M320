/**
 * Test 4 Java, Mission Starship-Commander
 * esempio di codice per gestire componenti su marte
 *
 * @author Fabio Maruca
 * @version Gennaio 2026
 */

package Ch.samt.starship.app;

import Ch.samt.starship.data.ComponenteMarte;
import Ch.samt.starship.data.Trasmettitore;
import Ch.samt.starship.model.AntennaParabolica;
import Ch.samt.starship.model.Astronauta;
import Ch.samt.starship.model.BaseSpaziale;
import Ch.samt.starship.model.RoverEsploratore;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //PARTE 1: test eccezioni ossigeno sotto 0
        System.out.println("\nPARTE 1: test eccezioni ossigeno sotto 0");
        Astronauta as1 = new Astronauta("Paolo Forte", "Ingegnere");
        try {
            AntennaParabolica antenna0 = new AntennaParabolica("B-7250", -10, as1);
        } catch (IllegalArgumentException iae) {
            System.out.println("ERRORE: "+iae.getMessage());
        }

        //PARTE 2: setup
        System.out.println("\nPARTE 2: setup");
        AntennaParabolica antenna1 = new AntennaParabolica("A-230", 50, as1);
        RoverEsploratore rover1 = new RoverEsploratore("C-2020", 5, as1);

        //PARTE 3: componenti e arraylist
        System.out.println("\nPARTE 3: componenti e arraylist");
        BaseSpaziale base1 = new BaseSpaziale("OVER MARS");
        base1.getComponenti().add(antenna1);
        base1.getComponenti().add(rover1);

        //PARTE 4: polimorfismo
        System.out.println("\nPARTE 4: polimorfismo");
        ArrayList<Trasmettitore> trasmettitore1 = new ArrayList<>();
        trasmettitore1.add(antenna1);
        trasmettitore1.add(rover1);

        for ( Trasmettitore componente : trasmettitore1 ) {
            componente.sintonizza(433.92);
            try {
                componente.inviaSegnale("SOS Marte");
            } catch (IllegalStateException ise) {
                RoverEsploratore rover = (RoverEsploratore)componente;
                System.out.println("Emergenza per l'astronauta "+ rover.getResponsabile().getNome()+"! Errore: "+ise.getMessage());
            }
        }

        //PARTE 5: stato finale della base e componenti
        System.out.println("\nPARTE 5: stato finale della base e componenti");
        System.out.println("Base: "+base1.getNome());
        base1.eseguiManutenzione();

        //PARTE 6: controllo degli equals
        AntennaParabolica antenna2 = new AntennaParabolica("A-230", 50, as1);
        RoverEsploratore rover2 = new RoverEsploratore("A-230", 5, as1);
        System.out.println("\nPARTE 6: controllo degli equals");
        if (antenna1.equals(rover2)) {
            System.out.println(antenna1.getId()+"è uguale a "+rover1.getId());
        } else {
            System.out.println("Rover e Antenne non possono essere uguali!");
        }

        if (antenna1.equals(antenna2)) {
            System.out.println(antenna1.getId()+" è uguale a "+antenna2.getId());
        } else {
            System.out.println("Le due antenne non sono uguali!");
        }
    }
}