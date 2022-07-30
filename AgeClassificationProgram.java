package con.dinesh.javaapp;
import java.util.Scanner;
public class Module1_Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String blood = null;
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your blood group");
        String bloodGroup=sc.next();

        if(age>=20)
            blood="RED";
        else if(age>=15 && age<20)
            blood="BLUE";
        else if(age>=10 && age<15)
            blood ="YELLOW";


        //main output program

        System.out.println("-------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Blood Group: "+bloodGroup);
        System.out.println("-------------------------");
        System.out.println("Your Group is "+blood);
        System.out.println("-------------------------");

    }
}
