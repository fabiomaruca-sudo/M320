import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MondoVoxel mondo = new MondoVoxel("Ark MC");
        ItemDrop diamante = new ItemDrop("diamante", 2);
        Lanterna l1 = new Lanterna(50, 25.5, 3, "Lanterna di rame", diamante, 4, 10);
        Blaze b1 = new Blaze(10, 15.5, 10.5, "Blaze", diamante, 20, 5);

        mondo.getVoxels().add(l1);
        mondo.getVoxels().add(b1);
        mondo.visualizzaStato();

        ArrayList<Illuminante> luce = new ArrayList<>();
        luce.add(l1);
        luce.add(b1);
        for (Illuminante illuminante : luce) {
            illuminante.setLivelloLuce(Illuminante.LUCE_MAX);
        }
    }
}