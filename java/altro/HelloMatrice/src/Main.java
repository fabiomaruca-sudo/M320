//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float[][] matrice;
        matrice = new float[3][3];

        for (int i = 0; i < matrice.length; i++) {
            System.out.println();
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = i*j;
                System.out.print(matrice[i][j]+" ");
            }
        }
    }
}