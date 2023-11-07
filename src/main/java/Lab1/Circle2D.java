package Lab1;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius*radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean contains(double x, double y) {
        double ab = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        double distance = Math.sqrt(ab);
        return radius>=distance;
    }
    
    public boolean contains(Circle2D circle){
        double ab = Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2);
        double distance = Math.sqrt(ab);
        return radius>=(distance+circle.getRadius());        
    }
    
    public boolean overlaps(Circle2D circle){
        double ab = Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2);
        double distance = Math.sqrt(ab);
        return (circle.getRadius()+radius)>=distance;         
    }
    
    public static void main(String[] args) {
        Circle2D c1 = (new Circle2D(2, 2, 5.5));
        System.out.println("The area of the circle : "+c1.getArea());
        System.out.println("The perimeter of the circle : "+c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4,5,10.5)));
        System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
