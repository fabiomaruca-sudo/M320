//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(10);
        System.out.println(sq1.getArea());
        sq1.draw();
        System.out.println(sq1.getDimension());

        Square sq2 = new Square(0);
        sq2.draw();
        System.out.println(sq2.getDimension());

        Square sq3 = new Square();
        sq3.draw();
        System.out.println(sq3.getDimension());
    }
}