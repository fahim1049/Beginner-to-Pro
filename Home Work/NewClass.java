
package home.homework;

/**
 *
 * @author fahim
 */
class Student {
    String name;
    int roll_no;

    Student() {
        name = "John";
        roll_no = 2;
    }
}

public class NewClass {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name + ", Roll No: " + s.roll_no);
    }
}