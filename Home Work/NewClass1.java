
package home.homework;

/**
 *
 * @author fahim
 */
class Student {
    String name;
    int roll_no;
    String phone_number;
    String address;

    Student(String n, int r, String p, String a) {
        name = n;
        roll_no = r;
        phone_number = p;
        address = a;
    }
}

public class NewClass1 {
    public static void main(String[] args) {
        Student s1 = new Student("Sam", 1, "1234567890", "123 Main St");
        Student s2 = new Student("John", 2, "0987654321", "456 Elm St");

        System.out.println("Roll No: " + s1.roll_no + ", Phone Number: " + s1.phone_number + ", Address: " + s1.address);
        System.out.println("Roll No: " + s2.roll_no + ", Phone Number: " + s2.phone_number + ", Address: " + s2.address);
    }
}
