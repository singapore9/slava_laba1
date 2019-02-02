public class Shapes {
    private int a = 10;
    private int b = 20;
    private int c = 30;
    private int d = 40;
    private int e = 50;
    private int f = 60;
    public void createFigures () {
        Shapes rect = new Rectangle(a,b,c,d);
        Shapes sq = new Square(a,b,c,d);
        Shapes line = new Line(a,b);
        Shapes oval = new Oval(a,b,c,d);
        Shapes circle = new Circle(a,b,c,d);
        Shapes rnd = new RoundRect(a,b,c,d,e,f);
    }
}

class Rectangle extends Shapes{
    Rectangle (int a,int b, int c, int d) {
        System.out.println ("Rectangle ("+a+"; "+b+"; "+c+"; "+d+")");
    }
}
class Square extends Shapes {
    Square (int a,int b,int c, int d){
        System.out.println("Square ("+a+"; "+b+"; "+c+"; "+d+")");
    }
}
class Line extends Shapes {
    Line (int a,int b){
        System.out.println("Line ("+a+"; "+b+")");
    }
}
class Oval extends Shapes {
    Oval (int a,int b, int c, int d) {
        System.out.println ("Oval ("+a+"; "+b+"; "+c+"; "+d+")");
    }
}
class Circle extends Shapes {
    Circle (int a,int b, int c, int d) {
        System.out.println ("Circle ("+a+"; "+b+"; "+c+"; "+d+")");
    }
}
class RoundRect extends Shapes {
    RoundRect (int a, int b, int c, int d, int e, int f) {
        System.out.println("Round Rectangle ("+a+"; "+b+"; "+c+"; "+d+"; "+e+"; "+f+")");
    }
}