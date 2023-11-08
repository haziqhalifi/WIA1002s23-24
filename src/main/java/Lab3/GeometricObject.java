package Lab3;

public class GeometricObject {

    String color;
    boolean filled;

    public GeometricObject() {
        this.color = "red";
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "Color : " + color + "\nFilled : " + filled;
    }

}

class Circle extends GeometricObject {
    private double radius = 1;
    
    public Circle(){
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString(){
        return "Color : " + color + "\nFilled : " + filled+"\nRadius : "+radius;
    }
}

class Rectangle extends GeometricObject{
    private double width = 1;
    private double height = 1;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
