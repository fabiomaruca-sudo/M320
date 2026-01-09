import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RisonanzaMagnetica rm1 = new RisonanzaMagnetica("A-30", 2013);
        DefibrillatoreSmart df1 = new DefibrillatoreSmart("BC-230", 1950);
        SmartwatchPaziente swp1 =  new SmartwatchPaziente("D-104", 100);

        ArrayList<Emergenza> oggetti = new ArrayList<Emergenza>();
        oggetti.add(df1);
        oggetti.add(swp1);
        for (Emergenza oggetto : oggetti) {
            oggetto.inviaAllarme("test");
        }
    }
}