package con.dinesh.javaapp;
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] m={10,20,30,40};
//        try {
//            System.out.println(m[n]/0);
//            System.out.println(m[n]); //taking the index value form the user into variable 'n'
//        }
//        catch(ArrayIndexOutOfBoundsException|ArithmeticException exception){
//            System.out.println(exception);
//        }finally{
//            System.out.println("This is always executed dude!");
//        }
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("This is the end of the program");
    }
}
