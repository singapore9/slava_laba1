public class Oval implements DrawableInterface {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    Oval(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void draw() {
        System.out.println ("Oval (upper left " + x1 + "; " + y1 + " and bottom right " + x2 + "; " + y2 + ")");
    }
}