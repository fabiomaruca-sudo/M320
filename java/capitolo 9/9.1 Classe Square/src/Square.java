public class Square {
    private int side;

    //COSTRUTTORE
    public Square(int side) {
        if (side > 0) {
            this.side = side;
        } else  {
            System.out.println("Invalid side value, default = 5");
            this.side = 5;
        }
    }

    public Square() {
        this.side = 5;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public void draw() {
        for (int i = 0; i < side; i++) {
            System.out.println();
            for (int j = 0; j < side; j++) {
                if ((i == 0 || i == side-1) ||  (j == 0 || j == side-1)) {
                    System.out.print("*");
                } else  {
                    System.out.print(" ");
                }
                System.out.print("   ");
            }
        }
    }

    public String getDimension() {
        return "Quadrato " + side + "x" + side;
    }
}
