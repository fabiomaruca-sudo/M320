import java.util.ArrayList;

public class MondoVoxel {
    private String nome;
    private ArrayList<ComponenteVoxel> voxels;

    public MondoVoxel(String nome) {
        this.nome = nome;
        this.voxels = new ArrayList<>();
    }

    public ArrayList<ComponenteVoxel> getVoxels() {
        return voxels;
    }

    public void visualizzaStato() {
        System.out.println("Nel mondo "+nome+" ci sono i seguenti voxels:");

        for (ComponenteVoxel voxel : voxels) {
            System.out.print(voxel.nome);

            if (voxel.getClass().equals(Blaze.class)) {
                Blaze blaze = (Blaze) voxel;
                blaze.interazionePlayer();
            } else if (voxel.getClass().equals(Lanterna.class)) {
                Lanterna lanterna = (Lanterna) voxel;
                lanterna.distruzione();
            }
        }
    }
}
