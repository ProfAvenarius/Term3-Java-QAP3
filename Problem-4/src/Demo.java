public class Demo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];


        shapes[0] = new Circle("Circle1", 5.0);
        shapes[1] = new Ellipse("Ellipse1", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle1", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("EqTriangle1", 6.0);
        shapes[4] = new Ellipse("Ellipse2", 8.0, 3.0);


        System.out.println("Shape Information Before Scaling:");
        System.out.println("================================");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }


        System.out.println("\nScaling all shapes by factor 2.0...");
        scaleShapes(shapes, 2.0);


        System.out.println("\nShape Information After Scaling:");
        System.out.println("===============================");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }


    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}