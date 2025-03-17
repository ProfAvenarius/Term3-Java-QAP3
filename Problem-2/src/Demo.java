public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Point p1: " + p1);

        p1.setXY(3.0f, 4.0f);
        System.out.println("After setXY, p1: " + p1);

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(5.0f, 6.0f, 0.5f, 0.5f);
        System.out.println("MovablePoint mp1: " + mp1);

        mp1.move();
        System.out.println("After move, mp1: " + mp1);

        mp1.setSpeed(1.0f, 1.0f);
        mp1.move();
        System.out.println("After setting speed and moving again, mp1: " + mp1);

    }
}
