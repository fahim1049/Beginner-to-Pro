
package home.homework;

/**
 *
 * @author fahim
 */
import java.lang.Math;

class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    int getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class NewClass2 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area of triangle is " + t.getArea());
        System.out.println("Perimeter of triangle is " + t.getPerimeter());
    }
}