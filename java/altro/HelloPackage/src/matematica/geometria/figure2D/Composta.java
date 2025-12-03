package matematica.geometria.figure2D;

import matematica.geometria.figure3D.Cubo;

public class Composta {
    private Rettangolo rettangolo;
    private Cerchio cerchio;

    public Composta() {
        this.cerchio = new Cerchio(5);
        this.rettangolo = new Rettangolo(4);
    }


}
