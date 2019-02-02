public class Shapes {
    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;
    private int e = 5;
    public void createFigures () {
        Shape rect = new Rectangle(a, b, c, d);
        rect.draw();
        Shape sq = new Square(a, b, c);
        sq.draw();
        Shape line = new Line(a, b, c, d);
        line.draw();
        Shape oval = new Oval(a, b, c, d);
        oval.draw();
        Shape circle = new Circle(a, b, e);
        circle.draw();
        Shape rnd = new RoundRect(a, b, c, d, e);
        rnd.draw();
    }
}
