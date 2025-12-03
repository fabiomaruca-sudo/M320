public class Automobile {
    private String marca;
    private String modelo;
    private Targa targa; //relazione con la classe Targa

    public Automobile(String marca, String modelo, Targa targa) {
        this.marca = marca;
        this.modelo = modelo;
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Targa getTarga() {
        return targa;
    }

    public void setTarga(Targa targa) {
        this.targa = targa;
    }
}
