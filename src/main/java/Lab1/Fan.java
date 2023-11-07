package Lab1;

public class Fan {

    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean switchOn = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setSwitchOn(true);
        System.out.println(fan1);

        System.out.println("");

        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5); //dont need to assign if the radius is default.
        fan2.setColor("blue");
        fan1.setSwitchOn(false);
        System.out.println(fan2);
    }

    public String toString() {
        if (switchOn == true) {
            return "Speed : " + speed + "\ncolor : " + color + "\nRadius : " + radius;
        } else {
            return "Color : " + color + "\nRadius : " + radius + "\nfan is off";
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        this.switchOn = switchOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
