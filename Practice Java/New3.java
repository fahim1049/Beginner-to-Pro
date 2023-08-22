import java.util.Scanner;
public class New3 {
    public static void main(String[]args){
        System.out.print("Enter your Number for a:");

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter your Number for b:");
        int b = sc.nextInt();

            if(a == b){
                System.out.println("Equal");
            }else{
                if(a>b){
                    System.out.println("a is Gretter");
                }else{
                    System.out.println("a is Small");
                }
            }
    }

}
