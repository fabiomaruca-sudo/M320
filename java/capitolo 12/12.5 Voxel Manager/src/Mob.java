public abstract class Mob extends ComponenteVoxel {

    protected double hp;

    public Mob(double x, double y, double z, String nome, ItemDrop itemDrop, double hp) {
        super(x, y, z, nome, itemDrop);
        this.hp = hp;
    }

    public abstract void interazionePlayer();
}
