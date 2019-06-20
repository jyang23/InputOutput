import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;
        double average;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();

        average = (num1+num2)/2.0;

        System.out.println("The average value is : " + average);
    }
}