import java.util.Random;
import java.util.Scanner;
public class RandomNumGAME
{
	public static void main(String [] args)
	{
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int number=r.nextInt(10);
        int guess=sc.nextInt();
        while(guess!=number){
        guess=sc.nextInt();

        
        }
        System.out.println("Congratz !! You found it !! Number is "+number);
	}
}