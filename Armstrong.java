import java.util.*;

class Armstrong
{
	public static void main(String [] args)
	{
		int sum,i,number,length=0,mod,armstrong=0,modulous;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		number = s.nextInt();
		modulous = number;
		
		while(modulous>0)
		{
			modulous = modulous/10;
			length = ++length;
		}
	
		modulous = number;
		while(modulous>0)
		{
			mod = modulous%10;
			modulous = modulous/10;
			sum = 1;
			for(i=0;i<length;i++)
			{
				sum = sum*mod;
			}	
			armstrong = armstrong + sum;
		}
		
		if(number == armstrong)
		{
			System.out.println(number + " is a Armstrong number");
		}
		else
		{
			System.out.println(number + " is not a Armstrong number");
		}
	}
}
