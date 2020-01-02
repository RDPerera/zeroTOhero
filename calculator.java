import java.util.Scanner;
public class calculator
{
	public static void main(String [] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number 1 :");
		a=sc.nextInt();
		System.out.print("Enter Operator :");
		char op=sc.next().charAt(0);
		System.out.print("Enter Number 2 :");
		b=sc.nextInt();
        if (b==0){
            System.out.println("Zero devision error !");
        }
        else{
            switch(op)
            {
                case '+' : System.out.println(a+b);break;
                case '-' : System.out.println(a-b);break;
                case '*' : System.out.println(a*b);break;
                case '/' : System.out.println(a/b);break;
                default : System.out.println("Enter Valid OP");
            }
        }
	}
}