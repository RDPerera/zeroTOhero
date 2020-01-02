import java.util.Scanner;
public class calculator
{
	public static void main(String [] args)
	{
		int a,b,ans;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1 :");
		a=sc.nextInt();
		System.out.print("Enter Operator :");
		char op=sc.next().charAt(0);
		System.out.print("Enter Number 2 :");
		b=sc.nextInt();
		if (op=='+')
			ans=a+b;
		else if(op=='-')
			ans=a-b;
		else if(op=='*')
			ans=a*b;
		else if(op=='/')
			ans=a/b;
		else
			ans=8888;
		System.out.println("Answer is"+ans);
	}
}