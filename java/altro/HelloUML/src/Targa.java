public class Targa {
    private String targa;

    public Targa(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    @Override
    public String toString() {
        return "Targa{" +
                "targa='" + targa + '\'' +
                '}';
    }
}
