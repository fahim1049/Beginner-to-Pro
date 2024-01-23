

package home.homework;

/**
 *
 * @author fahim
 */
import java.util.Scanner;

class Area {
    int length;
    int breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }
}

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        a.setDim(length, breadth);
        System.out.println("Area of rectangle is " + a.getArea());
    }
}