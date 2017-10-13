//Jacky Chen
//Period 2
//Method Madness
public class JCHENmethodMadness {

	public static void main(String[] args) {
		isFibonnaci(100);
		multiplicationTable(5,5);
		dateStr("03/07/00");
	}
	public static boolean isFibonnaci(int num)
	{
		int x=0; int y=0; int z=1;
		while(x<num)
		{
			x=y+z;
			y=z;
			z=x;
			if(x==num)
			{
				System.out.println("true");
				return true;
			}
			
		}
		System.out.println("false");
		return false;
	
	
				
	}

	public static void multiplicationTable(int base, int range) 
	{
		int count=0; 
		for(count=0;count<=range;count++)
		{
			int product=0;
			product= base*count;
			System.out.println(product);
		}
		
	}
	public static String dateStr(String date)
	{
		String month=date.substring(0,2);
		String day=date.substring(3,5);
		String year=date.substring(6,8);
		System.out.println(day + "-" + month + "-" + year);
		return null;
	}
}