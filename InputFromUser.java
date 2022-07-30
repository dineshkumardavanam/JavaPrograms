package con.dinesh.javaapp;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=a+b;
        String name=sc.nextLine();
        System.out.println(name);
//        System.out.println("The sum is "+c);
        boolean a=sc.nextBoolean();
        System.out.println(a);

    }
}
