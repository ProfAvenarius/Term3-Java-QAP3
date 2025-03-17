public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);  // All sides are equal
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        // Area of equilateral triangle = (√3/4) × side²
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side;
    }

    @Override
    public void scale(double factor) {
        this.side *= factor;
        super.scale(factor);  // Also update the parent class fields
    }
}
