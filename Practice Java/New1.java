import java.util.*;
public class New1 {
    public static void main(String args[]){

        System.out.print("Enter your Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 17){
            System.out.println("Adult");

        }else{
            System.out.println("Not Adult");
        }
    }

}
