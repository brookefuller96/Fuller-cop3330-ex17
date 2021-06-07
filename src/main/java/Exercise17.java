
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        Scanner input = new Scanner(in);
        String gender = input.nextLine();
        double m_f = Double.parseDouble(gender);

        System.out.println("How many ounces of alcohol did you have? ");
        Scanner input2 = new Scanner(in);
        String alco = input2.nextLine();
        double A = Double.parseDouble(alco);

        System.out.println("What is your weight, in pounds?");
        Scanner input3 = new Scanner(in);
        String weight = input3.nextLine();
        double W = Double.parseDouble(weight);

        System.out.println("How many hours has it been since your last drink?");
        Scanner input4 = new Scanner(in);
        String hours = input4.nextLine();
        double H = Double.parseDouble(hours);


        if (m_f == 1)
        {
            double BAC = ( A * 5.14 / W * 0.73 ) - 0.15 * H ;
            System.out.println("Your BAC is " + BAC);

            if(BAC < .08)
            {
                System.out.println("It is legal for you to drive.");
            }
            if(BAC >= .08)
            {
                System.out.println("It is not legal for you to drive.");
            }
        }
        else
        {
            double BAC = ( A * (5.14 / W) * 0.66 ) - (0.15 * H);
            System.out.println("Your BAC is " + BAC);
            if(BAC < .08)
            {
                System.out.println("It is legal for you to drive.");
            }
            if(BAC >= .08)
            {
                System.out.println("It is not legal for you to drive.");
            }
        }
    }
}