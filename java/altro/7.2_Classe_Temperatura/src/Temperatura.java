public class Temperatura {
    public double celsius;

    // Costrutto
    Temperatura(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Errore! valore sotto lo zero assoluto");
            celsius = -273.15;
            System.out.println("Valore di default: -273,15");
        }
        this.celsius = celsius;
    }

    public String stato() {
        String temperatura = "";
        if (celsius >= 10 && celsius <= 25) {
            temperatura = "Temperato";
        } else if (celsius > 25) {
            temperatura = "Caldo";
        } else {
            temperatura = "Freddo";
        }
        return temperatura;
    }

    public double inFarenheit() {
        double farenheit = celsius * 1.8 + 32;
        return farenheit;
    }

    public double inKelvin() {
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    @Override
    public String toString() {
        return "Temperatura in Celsius: " + celsius +
                "\nStato: " + stato() +
                "\nIn Farenheit: " + inFarenheit() +
                "\nIn Kelvin: " + inKelvin() +
                "\n______________";
    }
}
