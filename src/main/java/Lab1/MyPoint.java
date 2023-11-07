package Lab1;

public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint nextPoint) {
        return Math.sqrt(Math.pow(nextPoint.x - this.x, 2) + Math.pow(nextPoint.y - this.y, 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }

     double distance(MyPoint P1, MyPoint P2) {
         return Math.sqrt(Math.pow(P1.x - P2.x, 2) + Math.pow(P1.y - P2.y, 2));
   }
    
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println(point2.distance(point1,point2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
