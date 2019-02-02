public class RoundRect extends Shape {
    private int r;

    RoundRect(int x1, int y1, int x2, int y2, int r) {
        super(x1, y1, x2, y2);
        this.r = r;
    }

    public void draw() {
        super.draw();
        System.out.println ("Used radius " + r);
    }
}
