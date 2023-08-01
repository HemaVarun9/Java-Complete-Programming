import java.util.Scanner;

public class b {
    public static void main(String args[])
    {
       double a,b,sum=0,avg=0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First No:");
        a=sc.nextDouble();
        System.out.println("Enter the Second No:");
        b=sc.nextDouble();
        sum=a+b;
        avg=sum/2;
        System.out.println("Average="+avg);
    }

}
