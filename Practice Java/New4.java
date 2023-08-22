import java.util.Scanner;
public class New4 {
    public static void main(String[]args){
        System.out.print("Enter your Button : ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("Fahim is good boy");
            break;
            case 2: System.out.println("He study Daffodil International University");
            break;
            case 3: System.out.println(" Her subject is Software Engineering(SWE)");
            break;
            case 4: System.out.println(" Location is Ashuliya Savar");
            break;
            default : System.out.println("Invalid");

        }
    }
}
