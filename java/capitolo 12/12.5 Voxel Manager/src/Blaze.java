public class Blaze extends Mob implements Illuminante {
    private int livelloLuce;

    public Blaze(double x, double y, double z, String nome, ItemDrop itemDrop, double hp, int livelloLuce) {
        super(x, y, z, nome, itemDrop, hp);
        this.livelloLuce = livelloLuce;
    }

    @Override
    public void setLivelloLuce(int livelloLuce) {
        if (hp <= 0) {
            throw new IllegalArgumentException("The mob must be alive");
        }

        this.livelloLuce = livelloLuce;
    }

    @Override
    public int getLivelloLuce() {
        return livelloLuce;
    }

    @Override
    public void interazionePlayer() {
        System.out.println(", azione: Blaze lancia una fiammata!");
    }
}
