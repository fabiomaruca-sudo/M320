public class Punto {
    private float x;
    private float y;

    //costrutto vuoto
    Punto() {
        this.x = 1.0f;
        this.y = 1.0f;
    }

    //costrutto con argomenti
    Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public int calcolaDistanza() {
        double distanza = Math.sqrt((x-0) * (x-0) + (y-0) * (y-0));
        return (int) distanza;
    }

    public String determinaQuadante() {
        int quadrante = 0;
        if (x > 0) {
            quadrante = 1;
            if (y < 0) {
                quadrante = 4;
            }
        }else if (x < 0) {
                quadrante = 2;
                if (y < 0) {
                    quadrante = 3;
                }
            }
        String frase = "Il punto è sul " + quadrante + " quadrante";
        return frase;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                ", Distanza Centro= " + calcolaDistanza() +
                ", quadrante= " + determinaQuadante() +
                '}';
    }
}
