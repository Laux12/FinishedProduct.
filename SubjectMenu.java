import java.util.Scanner;
//subclass sa subjectControl
//parent class niya ang subjectControl
public class SubjectMenu extends SubjectControl{
	private String command;

	public void subjectMenu() {
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		//create an infinite loop
		do {
		
		System.out.println("\n\n\n=========================Subject Menu=========================");
		System.out.println("Every Value must be separated by a comma, No extra spaces!");
		System.out.println("Add Subject (Format)->[add,IT123,Subject Name]"
				+ "\nUpdate Subject (Format)->[update,Subject Code,Subject Name]"
				+ "\nDelete Subject (Format)->[delete,Subject Code]"
				+ "\nSearch Subject (Format)->[search,Subject Code]"
				+ "\nGet All Subject (Format)->[all]"
				+ "\nExit (Format) -> [exit]");
		System.out.println("==============================================================");
		System.out.print("Enter your Command: ");
		command = input.nextLine();
		this.setCommand(command);//call ang setCommand methods nga naa sa iyang parent class
		//then ipasa ang command nga gi input sa user
		}while(loop);
		
		input.close();
	
	}
	
}	
