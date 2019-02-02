public class RoundRect implements DrawableInterface {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int r;
            
    RoundRect(int x1, int y1, int x2, int y2, int r) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.r = r;
    }

    public void draw() {
        System.out.println ("\nRoundRect (upper left " + x1 + "; " + y1 + " and bottom right " + x2 + "; " + y2 + ") and radius " + r);
    }
}
