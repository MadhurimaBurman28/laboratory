package oops;
// for overriding the child class method name should be same as parent method name
//the parameters passed in the method should also be the same
//there should be a is-a relationship (parent /child relation)
class Rbi //parent class
{
	public void loanInterest()
	{
		System.out.println("9% loan interest");
		
	}
	}
class Sbi extends Rbi  //child 1 class
{
	public void loanInterest()
	{
		System.out.println("SBI: 5% Loan interest");
	}
	}
class Hdfc extends Rbi //child class 2
{
	public  void loanInterest()
	{
		System.out.println(" HDFC : 8.5% loan interest");
	}
	}

public class OverridingDemo {

	public static void main(String[] args) {
		Rbi rbi;
		rbi=new Sbi();
		rbi.loanInterest();
		rbi=new Hdfc();
		rbi.loanInterest();;
	}

}
