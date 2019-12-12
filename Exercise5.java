import java.util.Scanner;
public class Exercise5{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temp in Fahrenheit: ");
		float fah=sc.nextFloat();
		float cel=5/9*(fah-32);
		System.out.println(fah+"F = "+cel+"C");
	}
}