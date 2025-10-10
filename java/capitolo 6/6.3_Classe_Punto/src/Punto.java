import math;
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
        int quadante = 0;
        if (x > 0) {
            quadrante = 1;
        }
    }
}
