import java.util.ArrayList;
//naka extends sa Subjectmethods 
//para pwede ra maka access ang studentmenu sa mga methods or mga variables nga naa sa iyang parent
//class nga studentControl except sa mga private
public class StudentMethods extends SubjectMethods{
	//create og arrayList para ma store ang name sa mga student
	ArrayList<String> studentNames = new ArrayList<>();
	
	//create og arrayList para ma store ang address sa mga student
	ArrayList<String> studentAddress = new ArrayList<>();
	
	//create og arrayList para ma store ang age sa mga student
	ArrayList<Integer> studentAge = new ArrayList<>();
	
	//create og arrayList para ma store ang ID sa mga student
	ArrayList<Integer> studentId = new ArrayList<>();
	
	//create og arrayList para ma store ang status kung enroll naba ang mga student or dili
	ArrayList<String> status = new ArrayList<>();
	
	//create og arrayList para ma store ang subjects nga gi enrollan sa students
	//kada student kay naay kaugalingon nga list para ma storan sa ilahang subjects nga gi enrollan
	ArrayList<ArrayList<String>> studentSubjects = new ArrayList<>();
	
	//create og arrayList para ma store ang grades nga gi enrollan nga subject sa students
	//kada student kay naay kaugalingon nga list para ma storan sa ilahang grades nga gi enrollan
	ArrayList<ArrayList<Float>> studentGrades = new ArrayList<>();
	
	//ang index nga variable ang storan sa index kung unsa ang eupdate remove search grade or ang eenroll
	//ang len nga variable kay ang storan sa size kung pila kabouk sulod sa list sa mga id sa student
	//ang checker nga variable kay ang storan sa index kung ang index kay -1 meaning wala sya sa list
	//og kung 0 pataas meaning naa sya sa list 
	private int index,len,checker;
	//methods nga modawat og object nga student or katong Students nga class
	
	void addStudent(Students student) {
		//check kung naa naba ang id sa student nga iadd
		//indexOf kay kay kwaon ang index sa eadd nga student ID
		checker = studentId.indexOf(student.getID());
		//kung ang checker is = to -1 meaning wala pa sya sa list 
		if(checker == -1) {
		//add ang student ID sa arraylist nga studentId
		//ang kanang mga get kay method na sya sa Student nga class "getter"
		studentId.add(student.getID());
		
		//add ang student name sa studentNames nga list
		studentNames.add(student.getName());
		
		//add ang address sa arraylist nga studentAddress
		studentAddress.add(student.getAddress());
		
		//add ang student age sa list nga studentAge
		studentAge.add(student.getAge());
		
		//add ang status sa student nga not enrolled sa arrayList nga stat
		status.add(student.getEnrolled());
		
		//mag add og new Arraylist nga modawat og string para storan sa subject
		//nga ilang enrollan sa arraylist nga studentSubject 
		studentSubjects.add(new ArrayList<String>());
		
		//mag add og new Arraylist nga modawat og float para storan sa mga grades
		//sa mga subject nga ilang enrollan sa arraylist nga studentSubject 		
		studentGrades.add(new ArrayList<Float>());
		System.out.println("Student " + student.getID() + " Added Succesfully");
		//kung unsa ang index sa id mao pud ang index sa name, age og sa uban nga gi add pati ang list
		}
		
		//kung duplicate na ang student
		else {
			System.out.println("Student Already Exist");
		}
		
	}
	//method for update nga naay parameter nga id,newName,newAddress og newAge
	void update(int id, String newName, String newAddress, int newAge) {
		//get ang index sa id 
		checker = studentId.indexOf(id);
		//check kung naa ba ang student sa list
		if(checker != -1) {
		
		index = checker;
		//update ang student name, address, age sa nga naka posistion sa index 
		studentNames.set(index, newName);
		studentAddress.set(index, newAddress);
		studentAge.set(index, newAge);
		System.out.println("Student " + id + " Updated Succesfully");
		}else {
			//if wala ang student sa list
			System.out.println("Student does not exist");
		}
		
	}
	//delete method nga naay parameter nga id
	void delete(int id) {
		checker = studentId.indexOf(id);//get index sa id sa student
		if(checker != -1) {//check kung naa student sa list o wala
		//kung naa ang student id sa list
		index = checker;
		//remove tanan value nga nakapostion sa index 
		studentId.remove(index);
		studentNames.remove(index);
		studentAddress.remove(index);
		studentAge.remove(index);
		status.remove(index);
		studentSubjects.remove(index);
		studentGrades.remove(index);
		System.out.println("Student " + id + " has been Successfully removed!");
				}
		else {
			//kung wala ang student id sa list
		System.out.println("Student does not exist");
		}
	}
	//search method nga naay parameter nga id
	void search(int id) {
		String format = "";//for format
		index = studentId.indexOf(id);//get index sa id
		if(index != -1) {//check kung naa ang student sa list(-1 kung wala, possitive number or 0 kung naa)
		//print ang result
		System.out.println("\n\n=================================Result=====================================");
		System.out.println("----------------------------------------------------------------------------");
		//gamit og printf para sa format(%-10s - ang -10 kay kung ang minimum characters ang eprint kada specifier)
		
		System.out.printf("ID%-10sName%-16sAddress%-10sAge%-7sStatus%s\n",format,format,format,format,format);//format for spaces
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("%-12d%-20s%-17s%-10d%s\n",studentId.get(index),studentNames.get(index),studentAddress.get(index), studentAge.get(index),status.get(index));
		
		
		if(status.get(index).equals("Enrolled")) {//check if ang student kay enrolled na or wala pa
			System.out.println();//print new line
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("Subject Enrolled%-15sFinal Grade", format,format);
		System.out.println("\n----------------------------------------------------------------------------");
		//for loop para ma print tanan subjects og grade sa student
		//studentSubject.get(index sa id sa student).size() -> kwaon ang number kung pila kabouk subject ang gienrolan sa student
		for(int i = 0; i < studentSubjects.get(index).size(); i++) {
		//studentSubject.get(arraylist nga naka position sa index).get(subject nga naka position sa i)
		//studentGrades.get(arraylist nga naka position sa index).get(grade nga naka position sa i)
		System.out.printf("%-31s%.2f",studentSubjects.get(index).get(i),studentGrades.get(index).get(i));
		System.out.println();
			
				}
		System.out.println("\n\n==============================End of Result=================================\n\n");
		
			}
		}
		else {
			System.out.println("Student " + id + " is not in the list!");
		}
	}
	void displayAll() {
		len = studentId.size();//get ang length kung pila kabouk students
		if(len != 0) {//check if empty ang list
			//if not 0 ang length
		String format = "";//for format
		
		System.out.println("\n\n===============================Student List=================================");
		System.out.println("----------------------------------------------------------------------------");
		//gamit og printf para sa format(%-10s -> ang -10 kay ang minimum characters ang eprint kada specifier)
													 //(negative para right positve pa left)
		System.out.printf("ID%-10sName%-16sAddress%-10sAge%-7sStatus%s\n",format,format,format,format,format);
		System.out.println("----------------------------------------------------------------------------");
							
		for(int i = 0; i < len;i++) {
			//studentId.get(id nga naka postion sa i)...
			System.out.printf("%-12d%-20s%-17s%-10d%s\n",studentId.get(i),studentNames.get(i),studentAddress.get(i), studentAge.get(i),status.get(i));
			
					}
		System.out.println("\n\n==============================End of the List===============================");
		
		}
		//if empty ang list 
		else{
			System.out.println("Theres no Student added Yet!");
		}
	
	}
	//enroll method nga naay parameter nga id og subject
	public void enrollStudent(int id, String subject) {
			float tempGrade = 0;//temporary grade og the student
			int index = studentId.indexOf(id);//get ang index sa student id
			int subjectCheck = subjectCodes.indexOf(subject);//get ang index sa subject
			if(index != -1 && subjectCheck != -1) {//check kung naa ba ang student og subject sa list or wala(-1 = wala)
				status.set(index, "Enrolled");//set ang status sa student into enrolled
				studentSubjects.get(index).add(subject);//listSaSubjectNgaGiEnrollanSaStudent.get(index sa id).add(subject nga enrollan)
				studentGrades.get(index).add(tempGrade);//listSaGradesSaSubjectNgaGiEnrollanSaStudent.get(index sa id).add(tempGrade nga 0)
				System.out.println("Student " + id + " Successfuly Enrolled in " + subject);
			}
			else {//kung wala ang student or wala ang subject sa list
			
				System.out.println("Enroll Failed, Student ID or Subject does not Exist!");
			}
	}
	//grade methods nga nnay parameter nga id ,subjectCode, grade
	public void gradeStudent(int id, String subjectCode, float grade) {
			int index = studentId.indexOf(id);//get index sa studentId
			//listSaSubjectNgaGiEnrollanSaStudent.get(index sa id).indexOf(subject nga butangan og grade)
			int subjectIndex = studentSubjects.get(index).indexOf(subjectCode);//get ang index sa subject nga butangan og grade
			//check if ang student og subject kay naa sa gienrollan sa student og check kung enroll na ang student
			if(index != -1 && !status.get(index).equals("Not Enrolled") && subjectIndex != -1){
				//listSaGradesSaSubjectNgaGiEnrollanSaStudent.get(index sa id).set(index sa subject, ang grade)
				studentGrades.get(index).set(subjectIndex, grade);
				System.out.println("Student " + id + " has been Graded Successfully");
			}
			else {
				//if ang student or subject kay wala sa gienrollan sa student or wala pa naenroll na ang student
				System.out.println("Student ID or Subject Does Not exist or Student is Not erolled Yet!");
			}
		}
	
	
}
