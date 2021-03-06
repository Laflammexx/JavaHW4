//Gio Amirajibi

import java.util.*;

public class Pennies
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int daysWorked, pennies = 1, counter,total = 0;

        System.out.println("Please enter the number of days you've worked: ");
        daysWorked = keyboard.nextInt();

        while (daysWorked < 1)
        {
            System.out.println("You entered an invalid number of days. Please try again.");
            daysWorked = keyboard.nextInt();
        }

        System.out.println("Day\t\tPennies earned");

        for (counter = 1; counter <= daysWorked; counter++)
        {
            System.out.println(counter + "\t\t" + pennies);
            total += pennies;
            pennies *= 2;
        }

        System.out.println("Total pay is: $" + total/100.0);
    }
}

