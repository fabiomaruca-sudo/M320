//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automobile car1 = new Automobile("100", "Toyota", "Rius", 1990, true);
        System.out.println(car1.isStorica());
        car1.entraGarage();
        System.out.println(car1);

        Automobile car2 = new Automobile("230", "Lamborghini", "Lamorghetti", 2022, true);
        Automobile car3 = new Automobile("1024", "Lamborghini", "Urus", 2022, true);
        Automobile car4 = new Automobile("2000A", "Fiat", "Punto", 1945, false);

        Garage gar1 = new Garage("Garage 1", 5);
        gar1.aggiungiAuto(car1);
        gar1.aggiungiAuto(car2);
        gar1.aggiungiAuto(car3);
        gar1.aggiungiAuto(car4);
        gar1.mostraAuto();
        gar1.rimuoviAuto("100");
        gar1.mostraAuto();
        System.out.println(gar1.contaElettriche() + " Auto elettriche");

        System.out.println();
        System.out.println(gar1.cercaAuto("2000A"));
    }
}