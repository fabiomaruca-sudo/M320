//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot(false, 1990, "guida", "EB-1256", false);

        Archivio arc1 = new Archivio("Bellinzona", 4);
        arc1.aggiungiRobot(r1);
        arc1.attivaRobot("BT-7274");

        System.out.println(arc1);
    }
}