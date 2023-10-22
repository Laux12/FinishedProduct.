import java.util.ArrayList;

public class SubjectMethods {
	static ArrayList<String> subjectCodes = new ArrayList<>();//list for subject COdes
	ArrayList<String> subjectNames = new ArrayList<>();//list for subjectNames
	//ang index nga variable ang storan sa index kung unsa ang eupdate remove search grade or ang eenroll
	//ang len nga variable kay ang storan sa size kung pila kabouk sulod sa list sa mga id sa student
	//ang checker nga variable kay ang storan sa index kung ang index kay -1 meaning wala sya sa list
	//og kung 0 pataas meaning naa sya sa list 
	int index, len, checker;
    void addSubject(Subject subject) {
    	checker = subjectCodes.indexOf(subject.getSubjectCode());//get ang index kung asa naka position ang subject sa list
    if(checker == -1){//check if subject already exist
    	subjectCodes.add(subject.getSubjectCode());//add ang subjectCode sa subjectCodes nga arrayList
	    subjectNames.add(subject.getSubjectName());//add ang subjectName sa subjectNames nga arrayList
	    System.out.println("Subject " + subject.getSubjectCode() + " has been Added successfully ");
    }
    else {
    	//if duplicate na ang subject
    	System.out.println("Subject Already Exist");
    }
}
void updateSub(String subjectCode, String newsubjectName) {
	
	index = subjectCodes.indexOf(subjectCode);//get ang index kung asa naka position ang subject sa subjectCodes nga arraylist
	if(index != -1) {//check if naa ba ang subject sa list
	subjectNames.set(index, newsubjectName);//set og newName sa subject
	System.out.println("Subject " + subjectCode + " has been Updated successfully");
	
	}else {
		//kung wala sa list ang subject
		System.out.println("Subject Already Exist");
	}
	
}
void deleteSub(String subjectCode) {
	index = subjectCodes.indexOf(subjectCode);//get ang index kung asa naka position ang subject sa subjectCodes nga arraylist
	if(index != -1) {//check if naa ba ang subject sa list
	subjectCodes.remove(index);//remove ang subjectCode nga nakaposition sa index
	subjectNames.remove(index);//remove ang subjectName nga nakaposition sa index
	System.out.println("Subject " + subjectCode + " has been Removed successfully");
	}else {
		//if wala sa list ang subjects
		System.out.println("Subject Does Not Exist");
	}
}
void search(String subjectCode) {
	
	index = subjectCodes.indexOf(subjectCode);//get ang index kung asa naka position ang subject sa subjectCodes nga arraylist
	if(index  !=  -1) {//check if naa ba ang subject sa list
	String format = "";//for format
	System.out.println("============================Result================================");
	System.out.println("------------------------------------------------------------------");
	//gamit og printf para sa format(%-10s - ang -10 kay kung ang minimum characters ang eprint kada specifier)
	System.out.printf("Subject Code%-16sSubject Name%-16s\n",format,format);
	System.out.println("------------------------------------------------------------------");
	//subjectCodes.get(subject nga naka postion sa index)
	System.out.printf("%-28s%-23s\n",subjectCodes.get(index),subjectNames.get(index));
	System.out.println("\n\n=========================End of Result============================\n\n");
	}
	else {
		//if wala ang subject sa list
		System.out.println("Subject Code not Found, Please Try Again");
	}
	
}
void displayAll() {
	len = subjectCodes.size();//kwaon ang size sa arraylist nga subjectCodes
	if(len == 0) {//check if empty ang list
		System.out.println("\nThere are no Subjects added yet, Please add Subject First!");
	}else {
		//if naay sulod ang list
	String format = "";	//for format	
	System.out.println("\n\n==========================Subject List============================");
	System.out.println("------------------------------------------------------------------");
	//gamit og printf para sa format(%-10s - ang -10 kay kung ang minimum characters ang eprint kada specifier)
	System.out.printf("Subject Code%-16sSubject Name%-16s\n",format,format);
	System.out.println("------------------------------------------------------------------");
						
	for(int i = 0; i < len;i++) {
		//subjectCodes.get(subject nga naka postion sa i)
		System.out.printf("%-28s%-20s\n",subjectCodes.get(i),subjectNames.get(i));
		
			}
	System.out.println("\n\n========================End of the List===========================");
	
		}
	}
}
