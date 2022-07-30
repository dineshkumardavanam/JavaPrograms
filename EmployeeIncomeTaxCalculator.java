package con.dinesh.javaapp;

import java.util.Scanner;

public class Module2_Assignment2_Internshala {
    public static void main(String[] args) {
        System.out.println("Tax calculator APP");
        System.out.println("------Welcome------");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of persons");
        int n=sc.nextInt();

        String [] names=new String[n];
        long [] incomes=new long[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter the name of the user");
            names[i]=sc.next();
            System.out.println("Enter the income of the user");
            incomes[i]=sc.nextLong();
        }
        sc.close();


            System.out.println(" Names with liable taxes");
            System.out.println("---------------------------");


            for(int i=0;i<n;i++) {
                calculateTax(names[i],incomes[i]);
            }


    }
    private static void calculateTax(String name,long income){
        long tax;
        if(income>=300000)
            tax=income * 20/100;
        else if(income>=200000 && income<300000)
            tax=income * 10/100;
        else
            tax=0;

        System.out.println(name+":"+'\u20B9'+tax);

    }
}
