public class Circle extends Ellipse {
    private double radius;

    public Circle(String name, double radius) {
        super(name, radius, radius);  // In a circle, both axes are equal to the radius
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}