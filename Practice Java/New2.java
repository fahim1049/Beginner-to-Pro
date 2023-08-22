import java.util.Scanner;
public class New2 {
    public static void main(String[]args) {
     System.out.print("Enter Your Number:");
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
