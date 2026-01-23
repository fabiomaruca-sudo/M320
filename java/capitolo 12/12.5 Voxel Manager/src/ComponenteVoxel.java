import java.util.Objects;

public abstract class ComponenteVoxel {
    protected double x;
    protected double y;
    protected double z;
    protected String nome;
    protected ItemDrop itemDrop;

    //COSTRUTTORE
    public ComponenteVoxel(double x, double y, double z, String nome, ItemDrop itemDrop) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nome = nome;
        this.itemDrop = itemDrop;
    }

    //OVERRIDE
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ComponenteVoxel that = (ComponenteVoxel) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0 && Double.compare(z, that.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
