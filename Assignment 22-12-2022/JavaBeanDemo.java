package oops;
class College
{
	private int collegeId;
	private String collegeName;
	//no-args Constructor
	public College() {
	super ();
	}
	//parameterized constructor
	public College(int collegeId, String collegeName) {
		super();
		this.collegeId=collegeId;
		this.collegeName= collegeName;
	}
	//setter
	public void setCollegeId(int collegeId)
	{
		this.collegeId=collegeId;
	}
	//getter
	public int getCollegeId()
	{
		return collegeId;
	}
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
	public String getcollegeName()
	{
		return collegeName;
	}
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegename=" + collegeName + "]";
	}
}
public class JavaBeanDemo {

	public static void main(String[] args) {
		College college1=new College();
		college1.setCollegeId(101);
		college1.setCollegeName("University of kalyani");
		System.out.println(college1);
		System.out.println("College Name: "+college1.getcollegeName());
		System.out.println("College ID: "+college1.getCollegeId());
		College college2= new College();
		college2.setCollegeId(102);
		college2.setCollegeName("Jadavpur University");
		System.out.println(college2);
		System.out.println("College Nmae:"+ college2.getcollegeName());
		System.out.println("College Id:"+ college2.getCollegeId());
		
	}
	}


