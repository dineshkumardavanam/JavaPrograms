package con.dinesh.javaapp;

public class ArrayPrograms {
    public static void main(String[] args) {
    int[] marks=new int[5];
    int sum=0;
    marks[0]=10;
    marks[1]=20;
    marks[2]=30;
    marks[3]=40;
    marks[4]=50;
    for(int i=0;i<marks.length;i++){
        sum+=marks[i];

    }System.out.println(sum);
    }
}
