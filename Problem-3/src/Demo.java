public class Demo {
    public static void main(String[] args) {
        // Create an array 'shapes', of Shape objects
        Shape[] shapes = new Shape[5];

        // Initialize with different shapes
        shapes[0] = new Circle("Circle1", 5.0);
        shapes[1] = new Ellipse("Ellipse1", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle1", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("EqTriangle1", 6.0);
        shapes[4] = new Ellipse("Ellipse2", 8.0, 3.0);

        // Display shapes
        System.out.println("Shape Information:");
        System.out.println("==================");

        //Loop through shapes and print out each to 2 places after the decimal
        for (Shape shape : shapes) {
            System.out.printf("Shape: %s, Area: %.2f, Perimeter: %.2f%n",
                    shape.getName(), shape.calculateArea(), shape.calculatePerimeter());
        }
    }
}
