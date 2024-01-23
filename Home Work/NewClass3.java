
package home.homework;

/**
 *
 * @author fahim
 */
import java.lang.Math;

class Triangle {
    int side1;
    int side2;
    int side3;

    Triangle(int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    int getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class NewClass3 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of triangle is " + t.getArea());
        System.out.println("Perimeter of triangle is " + t.getPerimeter());
    }
}