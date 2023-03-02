import java.util.Scanner;
public class userInput {
    public static void main(String[]args){
        int number;
        String fahim;
        System.out.print("Please Enter an Number :");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.print("Please Enter an Charecter :");
        Scanner charecter = new Scanner(System.in);
        fahim = charecter.nextLine();

        System.out.println("Result  : "+number);
        System.out.println("Result2 : "+fahim);


    }
}
