import java.util.*;
public class MainMenu{
	//instantiate StudentMenu in static kay naka static ang method nga choice process
	static SubjectMenu subMenu = new SubjectMenu();
	//instantiate SubjectMenu in static kay naka static ang method nga choice process
	static StudentMenu sMenu = new StudentMenu();
	
	//declare as static nga access modifiers para macall ang method 
	//bisag wala nag buhat og instance sa class
	public static void mainMenu(){
		//declare ang variable para sa choice sa user
		int choice;
		//exception Handling try and catch (kung naay error sa na input sa user)
		try {
			//declare ang scanner
		Scanner input = new Scanner(System.in);
		//choice or ang UI
		System.out.println("============================Main Menu=========================");
		System.out.println("[1]Student Menu\n[2]Subject Menu\n[0]Exit");
		System.out.println("==============================================================");
		//prompt ang user kung unsa ilang choice
		System.out.println("Enter Your Choice: ");
		choice = input.nextInt();
		//twagon ang choiceProccess nga method nga naa sa ubos
		//tas pass ang value sa choice
		choiceProcess(choice);
		//close ang scanner
		input.close();
		//catch ang error nga Inputmismatch(example dili integer ang gi input 
		//sa user tas dili sya dawaton sa choice nga variable kay integer ra ang iyang dawaton
		//mag print daun og invalid input tas mubalik sa mainmenu
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input, Please Try Again!");
			MainMenu.mainMenu();
		}
		
	}
	//buhat og method para mutawag sa mga menu sa subject or sa student 
	static void choiceProcess(int choice) {
		//switch para sa choice sa user
		switch(choice) {
		//kung ang choice is = to 1 tawagon ang student menu
		case 1: 
			sMenu.studentMenu();
			
			break;
			//kung ang choice is = to 2 tawagon ang subject menu
		case 2:
			subMenu.subjectMenu();
			
			break;
		case 0:
			//kung ang choice is = to 0 return na sya or exit ang program 
			return;
		//kung ang choice is wala sa mga cases mag print og ivalid choice tas mobalik sa mainMenu
		default:
			System.out.println("Invalid Choice, Try Again");
			MainMenu.mainMenu();;
				
		}
	}
	
}
