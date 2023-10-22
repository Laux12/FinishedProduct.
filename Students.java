//class for students info
public class Students{
	//information of students
	private String studentName;
	private String address;
	private int age;
	private int id;
	private String enrolled;
	public Students(int id, String name, String address, int age) {//contructor 
		this.id = id;//set id
		this.studentName = name;//set name
		this.address = address;//set address
		this.age = age;//set age
		this.enrolled = "Not Enrolled";//set status
	}
	//getter for Name nga mag return sa name
	public String getName() {
		return this.studentName;
	}
	//getter for address nga mag return sa address
	public String getAddress() {
		return this.address;
	}
	//getter for age nga mag return sa age
	public int getAge() {
		return this.age;
	}
	//getter for id nga mag return sa id
	public int getID() {
		return this.id;
	}
	//getter for status nga mag return sa status
	public String getEnrolled() {
		return this.enrolled;
	}

}
