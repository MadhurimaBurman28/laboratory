package oops;

public class StudentNew 
{
	private int id;
	private String firstName;
	private String LastName;
	private String address;
           
		public StudentNew(int id, String firstName, String lastName, String address) {
			super();
			this.id = id;
			this.firstName = firstName;
			LastName = lastName;
			this.address = address;
		}

		public StudentNew() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

}
