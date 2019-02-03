import java.util.ArrayList;

public class Shapes {
    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;
    private int e = 5;
    public void createFigures () {
        Shape rect = new Rectangle(a, b, c, d);
        Shape sq = new Square(a, b, c);
        Shape line = new Line(a, b, c, d);
        Shape oval = new Oval(a, b, c, d);
        Shape circle = new Circle(a, b, e);
        Shape rnd = new RoundRect(a, b, c, d, e);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(sq);
        shapes.add(line);
        shapes.add(oval);
        shapes.add(circle);
        shapes.add(rnd);

        for (Shape s: shapes) {
            s.draw();
        }
    }
}
