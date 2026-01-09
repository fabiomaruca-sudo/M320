import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pikachu p = new Pikachu("Pikachu", 20, 20);
        Charmender  c = new Charmender("Charmender", 20, 20);

        p.usaMossaSpeciale();
        c.usaMossaSpeciale();

        ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
        poke.add(p);
        poke.add(c);
        for (Pokemon pok : poke) {
            pok.usaMossaSpeciale();
        }
    }
}