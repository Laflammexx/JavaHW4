//Gio Amirajibi

import java.util.Scanner;

public class TestResults
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double testResults, sum = 0, average;
        int counter, experiment;
        for (experiment = 1; experiment <= 4; experiment++)
        {
                for (counter = 1; counter <= 6; counter++)
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
