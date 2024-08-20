import java.util.*;
public class task1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        System.out.print("Enter the third number: ");
        int third = sc.nextInt();

        double avg = (first + second + third)/3;
        System.out.print("Average is " + avg);

    }
}