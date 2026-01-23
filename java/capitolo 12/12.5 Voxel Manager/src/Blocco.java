public abstract class Blocco extends ComponenteVoxel {
    protected int durabilita;

    public Blocco(double x, double y, double z, String nome, ItemDrop itemDrop, int durabilita) {
        super(x, y, z, nome, itemDrop);
        this.durabilita = durabilita;
    }

    public abstract void distruzione();
}
