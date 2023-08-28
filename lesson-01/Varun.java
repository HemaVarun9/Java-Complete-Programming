import java.util.*;
public class Varun {
    
    public static void main(String[] args){
        String name;
        int population;
        float populationDensity;
        double GDP;
        char currency;
        boolean isSecular;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your country name : ");
        name = scanner.nextLine();

        System.out.println("Enter your country population : ");
        population = scanner.nextInt();

        System.out.println("Enter your population Density : ");
        populationDensity = scanner.nextFloat();

        System.out.println("Enter GDP : ");
        GDP = scanner.nextDouble();

        System.out.println("currency used : ");
        currency = scanner.next().charAt(0);

        System.out.println("Is it a secular country : ");
        isSecular = scanner.nextBoolean();


        System.out.println( "Your country name is :  "+name);
        System.out.println( "Your country population is :  "+ population);
        System.out.println( "Your country population Density is :  "+ populationDensity);
        System.out.println( "Your country's GDP is :  "+GDP);
        System.out.println( "Your country's currency symbol is :  "+currency);
        System.out.println( " the country is secular :  "+isSecular);

        scanner.close();

    }
}



