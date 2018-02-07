import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Recursion 
{
	public static void main(String[] arg)
	{
		//TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader = new Scanner (System.in);
		//Initialize variables 
		String input;
		int n;
		//Welcomes user
		System.out.println("Hello User!");
		//Explains program to the user
		System.out.println("\nThis program will output the nth number from the Fibonacci series.");
		System.out.println("\nAnd also the series of numbers leading up to the nth.");
		//lets the program run once before asking the user if they want to perform the action again
		do
		{
		//ask the user for the nth fibonacci series 
		System.out.println("\nHow many numbers in the series would you like to print out: ");
		n = reader.nextInt();
		System.out.println( n + " numbers in the Fibonacci series using recursion are: ");
		//record how long it took the recursion function to run
		long startTime = System.nanoTime();
		//to print out the series of numbers
		for(int i=0; i<n; i++)
		{
            System.out.print(fiboSeriesRec(i) +" ");
        }
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("\nTime taken to calculate Fibonacci number with recursion: " + elapsedTime +"ns"); 
		System.out.println('\n');
		System.out.println( n + " numbers in the fibonacci series using iteration are: ");
		//record how long it took the iterative function to run
		startTime = System.nanoTime();
		//to print out the series of numbers
		for(int j=0; j<n; j++)
		{
			System.out.print(fiboSeriesIte(j) +" ");
		}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("\nTime taken to calculate Fibonacci number with iteration: " + elapsedTime +"ns");
		System.out.println("\nWould you like to input another number: ");
		input = reader.next();
		}while (input.compareTo("Y") == 0 || input.compareTo("y") == 0);
		System.exit(0);
	}
	//function to calculate the fibonacci series using tail recursion
	public static int fiboSeriesRec(int n)
	{
		while (n > 0)
		{ 
			if (n == 0 || n == 1)
			{
				return n; 
			} else
				return fiboSeriesRec(n - 1)+ fiboSeriesRec(n - 2);
		}
			 return 0;
	}
	//function to calculate the fibonacci series using iteration
	public static int fiboSeriesIte(int n)
	{
		if(n == 0 || n == 1)
		{ 
			return n; 
		} 
		int b=0, c=1, d=0; 
		for(int i = 2; i<= n; i++)
		{
			//Fibonacci number is sum of previous two Fibonacci number 
			d = b + c; 
			b = c; 
			c = d; 
		}
		return d;
	}

}
