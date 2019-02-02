public class Line extends Shape {
    Line(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void draw() {
        System.out.println("\nUsed custom Draw() method");
        System.out.println("Line: start (" + super.getX1() + ", " + super.getY1() + ") and end (" + super.getX2() + ", " + super.getY2() + ")");
    }
}
