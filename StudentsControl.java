//naka extends sa StudentsMethods para pwede ra magamit ani nga class ang mga methods sa StudentMEthods
public class StudentsControl extends StudentMethods{
	//commands
	private String[] wordCommand;//storan sa splited command
	public void setCommand(String command) {//method para maproccess ang command sa user
		wordCommand = command.split(",");//split ang command sa user kada naay comma(words is separated by a comma)
		try {//try and catch
		commandProcess(wordCommand[0]);//call ang commandProcess nga method then pas ang wordCommand[0]
		//wordCommand[0] == (add,update etc..) -> method
		}catch(IndexOutOfBoundsException  e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		}catch(NumberFormatException  e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		}
		
	}
	//process method nga naay parameter nga String method
	void commandProcess(String method) {
		method = method.toUpperCase();//convert ang method to uppercase
		 int age;
		 int id;
		 String name;
		 String address;
		 String subject;
		switch(method) {//switch for methods
		case "ADD"://if ang method is = to "ADD"
			 id = Integer.parseInt(wordCommand[1]);//convert and wordCommand[1] to integer nga id
			 name = wordCommand[2];//set ang name
			 address = wordCommand[3];//set ang address
			 age = Integer.parseInt(wordCommand[4]);//convert and wordCommand[4] to integer nga age
			 
			 this.addStudent(new Students(id,name,address,age));
			//call ang addStudent nga naa sa iyang parent class then ipasa ang bag ong student 
			
			 break;
		case "UPDATE"://if ang method is = to "UPDATE"
			 id = Integer.parseInt(wordCommand[1]);//convert and wordCommand[1] to integer nga id
			 name = wordCommand[2];//set ang name
			 address = wordCommand[3];//set ang address
			 age = Integer.parseInt(wordCommand[4]);//convert and wordCommand[4] to integer nga age
			 
			this.update(id,name,address, age);//call ang updateStudent method nga naa sa iyang parent class
			//then ipsa ang id, name ,address og age
			break;
		case "DELETE"://if ang method is = to "DELETE"
			id = Integer.parseInt(wordCommand[1]);//convert and wordCommand[1] to integer nga id
			this.delete(id);
		
			break;
		case "SEARCH"://if ang method is = to "SEARCH"
			id = Integer.parseInt(wordCommand[1]);//convert and wordCommand[1] to integer nga id
			this.search(id);//call ang search method nga naa sa iyang parent class then ipasa ang id
			
			break;
		case "ALL"://if ang method is = to "ALL"
			this.displayAll();//call ang displayAll method nga naa sa iyang parent class
			break;
		case "ENROLL"://if ang method is = to "ENROLL"
			id = Integer.parseInt(wordCommand[1]);//convert and wordCommand[1] to integer nga id
			subject = wordCommand[2];//set ang subject
			this.enrollStudent(id, subject);//call ang displayAll method nga naa sa iyang parent class
			//then ipasa ang id og subject
			break;
		case "GRADE"://if ang method is = to "GRADE"
			id = Integer.parseInt(wordCommand[1]);//convert and wordCommand[1] to integer nga id
			subject = wordCommand[2];//set ang subject
			float grade = Float.parseFloat(wordCommand[3]);//convert ang wordCommand[3] to float nga grade
			this.gradeStudent(id, subject, grade);//call ang gradeStudent method nga naa sa iyang parent class
			//then ipasa ang id,subject og grade
			break;
		case "EXIT"://if ang method is = to "EXIT"
			System.out.println("\n\n");
			MainMenu.mainMenu();//call ang mainMenu
			
			default:
				System.out.println("Invalid Format, Please Try Again");
		}
		
	
		
	}
	
	

}
