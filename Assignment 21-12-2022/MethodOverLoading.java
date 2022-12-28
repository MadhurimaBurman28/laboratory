package oops;
class Addition{
	public void add(int a)
	{
		System.out.println("Addition of one parameter:"+ (a+10));
	}
	
	public void add(int a, int b,int c) 
	{
		System.out.println("Addition of three parameters: "+ (a+b+c));;
	}
	public void add(double a, double b)
	{
		System.out.println("Addition of two double para,meters:"+(a+b));
		;
	}
	public void add(int a, double b)
	{
		System.out.println("addition" +(a+b));
	}
}

public class MethodOverLoading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(11);
		a.add(67,9 , 56);
		a.add(78.9, 98.9);
		a.add(89,35.9);

	}

}
