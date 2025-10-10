public class Rettangolo {
    private float latoMinore;
    private float latoMaggiore;

    //metodo costruttore, permette di costruire un oggetto con dei valori passati come argomento del metodo
    public Rettangolo(float latoMinore, float latoMaggiore) {
        this.latoMinore = latoMinore;
        this.latoMaggiore = latoMaggiore;
    }

    public float calcolaArea() {
        return latoMaggiore * latoMinore;
    }

    public float calcolaPerimetro() {
        return latoMaggiore * 2 + latoMinore * 2;
    }

    public void stampaInformazioni() {
        System.out.println("Area = " + calcolaArea() + "\nPerimetro = " + calcolaPerimetro());
    }

    public void stampaDimensioni() {
        System.out.println(latoMaggiore + " * " + latoMinore);
    }
}
