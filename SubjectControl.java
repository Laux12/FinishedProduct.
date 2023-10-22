//subclass sa subjectMehtods
//parent class niya ang subjectMehtods
public class SubjectControl extends SubjectMethods{
	private String[] wordCommand;

	public void setCommand(String command) {
		wordCommand = command.split(",");//split ang command kada naay commo nga char
		try {
			//wordCommand[0] == (add,update etc) -> method
			commandProcess(wordCommand[0]);//call ang commandProccess tas ipsa ang wordCommand[0]
		} catch (IndexOutOfBoundsException e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		} catch (NumberFormatException e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		}

	}
	//commandProcessMethod nga naay parameter nga String method
	void commandProcess(String method) {

		method = method.toUpperCase();//convert ang method into uppercase
		String  subjectCode;
		String subjectName;
		switch (method) {
		case "ADD"://if ang method is = to "ADD"

			subjectCode = wordCommand[1];
			subjectName = wordCommand[2];
			this.addSubject(new Subject(subjectCode,subjectName));//call ang add method nga naa sa iyang parent class
			//then ipasa ang bag o nga subject
			

			break;
		case "UPDATE"://if ang method is = to "UPDATE"
			subjectCode = wordCommand[1];
			subjectName = wordCommand[2];
			this.updateSub(subjectCode,subjectName);//call ang update method nga naa sa iyang parent class
			//then ipasa ang subjectCode og subjectName
			

			break;
		case "DELETE"://if ang method is = to "DELETE"
			subjectCode = wordCommand[1];
			this.deleteSub(subjectCode);//call ang delete method nga naa sa iyang parent class
			//then ipasa ang subjectCode

			break;
		case "SEARCH"://if ang method is = to "SEARCH"
			subjectCode = wordCommand[1];
			this.search(subjectCode);//call ang search method nga naa sa iyang parent class
			//then ipasa ang subjectCode

			break;
		case "ALL"://if ang method is = to "ALL"
			this.displayAll();//call ang display method nga naa sa iyang parent class
			break;
		case "EXIT"://if ang method is = to "EXIT"
			System.out.println("\n\n");
			MainMenu.mainMenu();//call ang mainMenu

		default:
			System.out.println("Invalid Format, Please Try Again");
		}

	}
}
