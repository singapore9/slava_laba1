public class Square implements DrawableInterface {
    private int x1;
    private int y1;
    private int a;

    Square(int x1, int y1, int a) {
        this.x1 = x1;
        this.y1 = y1;
        this.a = a;
    }

    public void draw() {
        System.out.println ("Square (upper left " + x1 + "; " + y1 + " and side " + a + ")");
    }
}
