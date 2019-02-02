public class Shapes {
    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;
    private int e = 5;
    public void createFigures () {
        Rectangle rect = new Rectangle(a, b, c, d);
        Square sq = new Square(a, b, c);
        Line line = new Line(a, b, c, d);
        Oval oval = new Oval(a, b, c, d);
        Circle circle = new Circle(a, b, e);
        RoundRect rnd = new RoundRect(a, b, c, d, e);
    }
}
