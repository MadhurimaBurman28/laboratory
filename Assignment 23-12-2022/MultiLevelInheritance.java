package oops;
//In multilevel inheritance there is a grandparent class, parent class and child class
//A child class can access all the information from the parent class and as well as the Grandparent class
class Animal //Grand parent Class
{
	public void display()
	{
		System.out.println("Animal Kingdom");
	}
	}
class Mammal extends Animal //parent class
{
	public void birth()
	{
		System.out.println("Mammals give birth to offsprings");
	}
}
class Dog extends Mammal //child class
{
	public void puppy()
	{
		System.out.println("Dog's offspring are puppy");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.display();
		dog.birth();
		dog.puppy();
	
	}

}
