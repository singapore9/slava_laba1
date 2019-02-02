public class Square extends Rectangle {
    private int side;

    Square(int x1, int y1, int a) {
        super(x1, y1, x1+a, y1+a);
        this.side = a;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("It is square. Side = " + side);
    }
}
