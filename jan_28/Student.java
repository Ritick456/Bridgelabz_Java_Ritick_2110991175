
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English Mark");
        int english = sc.nextInt();

        System.out.println("Enter Maths Mark");
        int math = sc.nextInt();

        System.out.println("Enter Science Mark");
        int science = sc.nextInt();


        // if(marks >= 75){
        //     System.out.println("Result - Distiortion");
        // }
        // else if(marks>40 && marks<75){
        //     System.out.println("Result - Pass");
        // }
        // else{
        //     System.out.println("Result - Fail");
        // }

        double total = english + math + science;

        double percent = total/300;

        System.out.println(percent);

    }
}
