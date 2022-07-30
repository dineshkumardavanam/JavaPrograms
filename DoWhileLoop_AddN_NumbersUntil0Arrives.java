package con.dinesh.javaapp;
import java.util.Scanner;
public class DoWhileLoop_AddN_NumbersUntil0Arrives {
    public static void main(String[] args) {
    double number=0;
    double sum=0;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Enter a number to be added");
        number=sc.nextDouble();
        sum+=number;
    }while(number!=0);
        System.out.println(sum);
    }

}
