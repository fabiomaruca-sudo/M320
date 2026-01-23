public class Lanterna extends Blocco implements Illuminante {
    private int livelloLuce;

    public Lanterna(double x, double y, double z, String nome, ItemDrop itemDrop, int durabilita, int livelloLuce) {
        super(x, y, z, nome, itemDrop, durabilita);
        this.livelloLuce = livelloLuce;
    }

    @Override
    public void setLivelloLuce(int livelloLuce) {
        this.livelloLuce = livelloLuce;
    }

    @Override
    public int getLivelloLuce() {
        return livelloLuce;
    }

    @Override
    public void distruzione() {
        System.out.println(" ha droppato l'item "+itemDrop.getItemName());
    }


}
