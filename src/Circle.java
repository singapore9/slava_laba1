public class Circle extends Oval {
    private int radius;

    // x0 and y0 -- center, r - radius
    Circle(int x0, int y0, int r) {
        super(x0-r, y0-r, x0+r, y0+r);
        this.radius = r;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("It is circle. Radius = " + radius);
    }
}
