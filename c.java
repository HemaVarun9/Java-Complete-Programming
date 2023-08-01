// Q: Write a java program to convert fahrenheit to celsius and celsius to Fahrenheit using formula        c = (5.0/9.0)*(f-32).

import java.util.Scanner;

public class c {
    public static void main(String[] args)
    {
        double c, f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        f = scan.nextDouble();
        c = (5.0/9.0)*(f-32);
        System.out.println("Temperature in Celsius:"+c);       
    }
}
