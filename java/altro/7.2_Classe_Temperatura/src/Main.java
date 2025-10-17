//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Temperatura temp1 = new Temperatura(24.93);
        System.out.println(temp1);
        Temperatura temp2 = new Temperatura(280.38);
        System.out.println(temp2);
        Temperatura temp3 = new Temperatura(-120.01);
        System.out.println(temp3);

        Temperatura[] temperature = {temp1, temp2, temp3};
        double media = 0;
        for (int i = 0; i <= temperature.length-1; i++) {
            media = media + temperature[i].celsius;
        }
        media = media / (temperature.length-1);
        System.out.println("Media: " + media);

        double temp = 0;
        double val = 0;
        int pos = 0;
        int posMinore = 0;
        double[] tempDecrescente = new double[2];
        for (int i = 0; i <= temperature.length-1; i++) {
            temp = temperature[i].celsius;
            val = temp;
            for (int j = 0; j < tempDecrescente.length; j++) {
                if (val > temperature[j].celsius && val != -300) {
                    val = temperature[j].celsius;
                    posMinore = pos;
                }
                pos++;
            }
            temperature[pos].celsius = -300;
            tempDecrescente[i] = val;
        }
        System.out.println("Temperature: " + tempDecrescente);
    }
}