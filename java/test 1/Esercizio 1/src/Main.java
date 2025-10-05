//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                System.out.println("Numero insufficiente di argomenti!");
                return;
            }
            String parola = args[0];
            String lettera = args[1];
            String sostituita  = args[2];

            String nuovaParola = parola.replace(lettera, sostituita);
            System.out.println(nuovaParola);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Numero insufficiente di argomenti!");
        }
    }
}