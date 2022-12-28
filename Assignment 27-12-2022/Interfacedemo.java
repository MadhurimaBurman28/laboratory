package abstraction;
interface Printable{ //first Interface
	int x=100;
	//we cannot add the body of the method so we need to implement it
	public void display();
	void fun();
}

//interface --inherits---> interface(extends)
//class --inherits--> class(extends)
//class ---inherits--> interface(implements)

interface Drawable extends Printable{ //second interface inheriting Printable
	void draw();
	void speak();
}

interface Sayable { //third interface without using extends it inherits both printable and drawable
	void say();
	int x=10;
}

class Print implements Drawable{

	@Override
	public void display() {
		System.out.println("HELLO");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun");
	}

	@Override
	public void speak() {
		System.out.println("i meant it");
		
	}
}
	//using interface we can perform multiple inheritance (though not supported in java )
	class Message implements Drawable,Sayable{
		//we can solve the diamond problem using interface 
		//a class can inherit any number of interfaces

		@Override
		public void say() {
			System.out.println("please say something");
			
		}

		@Override
		public void display() {
			System.out.println("Hello");// TODO Auto-generated method stub
			
		}

		@Override
		public void fun() {
			System.out.println(" it will be fun");
			
		}

		@Override
		public void draw() {
			System.out.println("Drawing is a good hobby");
			
		}

		@Override
		public void speak() {
			System.out.println("speaking is such a fun");
		}
		
	}
public class Interfacedemo {

	public static void main(String[] args) {
		//you cannot instantiate interface , but we can create reference variable
		Print print =new Print();
		print.display();
		print.fun();
		print.draw();
		print.speak();
		System.out.println("The value of x ="+ Printable.x);
		
		System.out.println();
		
		Message message= new Message();
		message.say();
		message.display();
		message.draw();
		message.fun();
		message.speak();
		System.out.println("The value of the x="+ Sayable.x);

	}

}

