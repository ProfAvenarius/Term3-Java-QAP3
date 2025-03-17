public class Ellipse extends Shape {
    private double a;  // major axis
    private double b;  // minor axis

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // Ensure a is the major axis (larger value)
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter approximation formula: P = π × 2(a² + b²) - (a - b)²/2
        return Math.PI * (2 * (a * a + b * b) - Math.pow(a - b, 2) / 2);
    }
}