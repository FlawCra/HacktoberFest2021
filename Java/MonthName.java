import java.util.*;
public class monthnames	
{
	public static void main(String[ ]  args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Month Name");
		String str = scn.nextLine();
		switch(str)
		{
			case "January" :
				case "march":
				case "May":
				case "July":
				case "August":
				case "October":
				case "December":
				System.out.println("31 days");
				break;
			case "April":
				case "June":
				case "September":
				case "November":	
					System.out.println("30 days");
				break;
			case "February":
				System.out.println("28 days");
				break;
			default:
				System.out.println("No match found! ");	
		}
	}
}
