public class Shape implements DrawableInterface {
    public void draw() {
        System.out.println("\nDraw " + this.getClass().getName());
    }
}
