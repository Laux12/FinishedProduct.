import java.util.Scanner;
//ang student menu kay naka inherit sa studentcontrol nga class
//para pwede ra maka access ang studentmenu sa mga methods or mga variables nga naa sa iyang parent
//class nga studentControl except sa mga private
public class StudentMenu extends StudentsControl{
	private String command;

	//methods para sa UI og ang mga command formats 
	public void studentMenu() {
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		//create an infinite loop
		do {
			//buhaton ni niya samtang sa command kay dili exit
		System.out.println("\n\n\n=========================Student Menu=========================");
		System.out.println("Every Value must be separated by a comma, No extra spaces!");
		System.out.println("Add Student (Format)->[add,student ID,Name,Address,Age]"
				+ "\nUpdate Student (Format)->[update,student ID,Name,Address,Age]"
				+ "\nDelete Student (Format)->[delete,student ID]"
				+ "\nSearch Student (Format)->[search,student ID]"
				+ "\nGet All Student (Format)->[all]"
				+ "\nEnroll Student	to Subject(Format) -> [enroll,student ID,Subject Code]"
				+ "\nGrade A Student (Format) -> [grade,student ID,Enrolled Subject Code,Grade"
				+ "\nExit(Main Menu) (Format) -> [exit]");
		System.out.println("==============================================================");
		System.out.print("Enter your Command: ");
		//kwaon ang commands sa user tas eestore sa command nga variable
		command = input.nextLine();
		//this.setCommand meaning ginatawag niya ang methods nga setCommand sa iyang parent class nga
		//studentControl nga class tas ipasa niya ang command nga variable
		this.setCommand(command);
		}while(loop);
		
		input.close();
	
	}
	
	
	
}
