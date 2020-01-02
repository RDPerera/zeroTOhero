import java.util.Scanner;
public class PrintType
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch >= '0' & ch <='9')
            System.out.println("It's a number");
        else if(ch >= 'a' & ch <='z')
            System.out.println("It's a lowerCase");
        else if(ch >= 'A' & ch <='Z')
            System.out.println("It's a upperCase");
        else
            System.out.println("It's a Symbol");
	}
}