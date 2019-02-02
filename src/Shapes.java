public class Shapes {
    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;
    private int e = 5;
    public void createFigures () {
        Rectangle rect = new Rectangle(a, b, c, d);
        rect.draw();
        Square sq = new Square(a, b, c);
        sq.draw();
        Line line = new Line(a, b, c, d);
        line.draw();
        Oval oval = new Oval(a, b, c, d);
        oval.draw();
        Circle circle = new Circle(a, b, e);
        circle.draw();
        RoundRect rnd = new RoundRect(a, b, c, d, e);
        rnd.draw();
    }
}
