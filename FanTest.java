class Fan {
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    // Instance variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    // Constructor
    public Fan() {
        // Default values
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }
    // Accessor methods
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    // Mutator methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // toString method
    public String toString() {
        return "Fan [Speed: " + speed + ", Status: " + (on ? "On" : "Off")
                +
                ", Radius: " + radius + ", Color: " + color + "]";
    }
}
public class FanTest {
    public static void main(String[] args) {
        // Create a Fan object
        Fan myFan = new Fan();
        // Set properties for the fan
        myFan.setSpeed(Fan.FAST);
        myFan.setOn(true);
        myFan.setRadius(10);
        myFan.setColor("yellow");
        // Display the fan object using toString method
        System.out.println(myFan.toString());
    }
}
