import java.util.Scanner;
public class Binary{
	public static void main(String [] args)
	{
		int a=63,b=15,c=7;
		System.out.println(a>b?a:b>c?b:c);
		System.out.println(a>b&&a>c?a:b<c?c:b);
	}
}