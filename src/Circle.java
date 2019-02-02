public class Circle implements DrawableInterface {
    private int x0;
    private int y0;
    private int r;

    Circle(int x0, int y0, int r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    public void draw() {
        System.out.println ("Circle (Center " + x0 + "; " + y0 + ") and radius " + r);
    }
}
