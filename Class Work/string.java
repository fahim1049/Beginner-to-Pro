import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.print("Enter Your Address: ");
        String yadd = input.next();
        System.out.println("Information : \nName :"+fname+" "+lname);
        System.out.println("Address : " +yadd);


    }
}
