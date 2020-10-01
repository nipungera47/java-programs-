int detail;
MyException(int a)
{
	detail=a;
}
public string toString()
{
	return	 "detail";
}
}
class p21
{
	static void compute (int a) throws MyException
	{
		throw new MyException(a);
	}
	public static void main(String[] args)
	{
		try
		{
			compute(3);
		}
		catch(MyException e)
		{
			System.out.print("Exception");
		}
	}
}
//This code is made by nipun 
