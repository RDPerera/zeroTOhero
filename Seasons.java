import java.util.Scanner;
public class Seasons
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month : ");
        int month=sc.nextInt();
        switch(month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Bogus month");
                break;
        }
        if (month==12 | month==1 | month==2)
            System.out.println("Winter");
        else if (month==3 | month==4 | month==5)
            System.out.println("Spring");
        else if (month==6 | month==7 | month==8)
            System.out.println("Summer");
        else if (month==9 | month==10 | month==11)
            System.out.println("Autumn");
        else
            System.out.println("Bogus month");
        
	}
}