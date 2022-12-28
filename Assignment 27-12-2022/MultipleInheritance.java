package abstraction;
//another way of performing multiple inheritance 

abstract class B    //declaring an abstract class
{
	abstract void display(); //abstract method 
	
	public void demo() //concrete method
	{
		System.out.println("Abstract Class");
	}
}

interface C // declaring an interface
{
	void add (int a, int b);
}

class D extends B implements C
{

	@Override
	public void add(int a, int b)
	{
		System.out.println("Sum:"+(a+b));
		
	}

	@Override
	void display() {
		System.out.println("MultipleInheritance");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		D d=new D();
		d.add(8, 9);
		d.display();
		d.demo();

	}

}
