package oops;
class Universitycourses
{
	public  void display()
	{
		System.out.println("University of Kalyani provides this Bachelor Dgree Programmes:");
	}
	
}
class Eie extends Universitycourses
{
	public void courseone()
	{
		System.out.println("1)Electronics & INstruementation Engineering");
	}
	}
class It extends Universitycourses
{
	public void coursetwo()
	{
		System.out.println("2) Information Technology");
	}
	}
class Cse extends Universitycourses
{
	public void coursethree()
	{
		System.out.println("3)Computer Science Engineering");
	}
	}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Universitycourses course=new Universitycourses();
		Eie course1=new Eie();
		It course2=new It();
		 Cse course3=new Cse();
		course.display();
		course1.courseone();
		course2.coursetwo();
		course3.coursethree();
		
	}

}
