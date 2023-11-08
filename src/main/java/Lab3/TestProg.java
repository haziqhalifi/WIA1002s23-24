package Lab3;

public class TestProg {

    public static void main(String[] args) {

        GeometricObject obj1 = new GeometricObject();
        System.out.println("\n=== Geometric Object ===");
        System.out.println(obj1.toString());

        Circle obj2 = new Circle();
        System.out.println("\n=== Default Circle ===");
        System.out.println(obj2.toString());

        Circle obj3 = new Circle(9, "black", false);
        System.out.println("\n=== Black, unfilled circle ===");
        System.out.println(obj3.toString());
        
        Rectangle obj4 = new Rectangle();
        System.out.println("\n=== Default rectangle ===");
        System.out.println(obj4.toString());

    }
}
