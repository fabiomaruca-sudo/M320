import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cane cane1 = new Cane("Marrone",5.5f,1,false);

        cane1.riportaOggetto();
        cane1.addestra();
        cane1.riportaOggetto();
        cane1.emettiVerso();
        System.out.println(cane1.peso);

        Serpente serpente1 = new Serpente("Marrone",5.5f,1,false);
        serpente1.emettiVerso();

        ArrayList<Animale> animali = new ArrayList<Animale>();
        animali.add(cane1);
        animali.add(serpente1);
        for (int i = 0; i < animali.size(); i++) {
            animali.get(i).emettiVerso();
        }

        System.out.println(serpente1 instanceof Animale);
    }
}