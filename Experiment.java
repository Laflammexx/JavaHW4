//Gio Amirajibi

import java.util.Scanner;

public class Experiment
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double testResults, sum = 0, average;
        int counter, experiment, numberOfResults;
        for (experiment = 1; experiment <= 4; experiment++)
        {
            System.out.println("Experiment " + experiment);
            System.out.println("Please enter the number of test results you have: ");
            numberOfResults = keyboard.nextInt();
            while (!(numberOfResults >= 1 && numberOfResults <= 6))
            {
                System.out.println("You've entered an invalid number. Please try again.");
                numberOfResults = keyboard.nextInt();
            }
            for (counter = 1; counter <= numberOfResults; counter++)
            {
                    System.out.println("Please enter test result #" + counter);
                    testResults = keyboard.nextDouble();
                    sum += testResults;
            }
            average = sum / (counter - 1);
            sum = 0;
            System.out.println("Average result for experiment #" + experiment + " = " + average);
        }
    }
}
