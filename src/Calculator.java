
public class Calculator {
	private  String delimiter=",|\n";
	public int calculate(String input) throws Exception{
	
		String [] numbers=input.split(delimiter);
		if(input.isEmpty())
		{
			return 0;
		}
		if(input.length()==1)
		{
			return Integer.parseInt(input);
		}
		else 
		{
			return getSum(numbers);
		}
		
		
	}
	
	
	//Sum Calculating method
	private int getSum(String [] numbers)throws Exception
	{
		String [] input=numbers;
		//Check if the numbers in string is negative
		findException(input);
		
		
		return calculateValues(input);
		
	}
	
	

	//find the invalid inputs
	private void findException(String [] numbers) throws Exception
	{
		for(String i:numbers)
		{
		if(Integer.parseInt(i)< 0)
		{
			throw new Exception("Negative inputs are is not valide");
		}
		}
	}
	
	private int calculateValues(String [] numbers)
	{
		int sum=0;
		
	
		for(String i:numbers)
		{
		if(Integer.parseInt(i)>1000)
				continue;
		sum += Integer.parseInt(i);
		}
		return sum;
	}
	 
	

}
