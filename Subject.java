//Object/class nga subject 
public class Subject {
	private String subjectCode;
	private String subjectName;
	
	public Subject(String subjectCode, String subjectName) {//contructor for subject
		this.subjectCode = subjectCode;//set ang subjectCode
		this.subjectName = subjectName;//set ang subjectName
	}
	//getter for subjectConde nga mag return og String nga subjectCode
	public String getSubjectCode() {
		return this.subjectCode;
	}
	//getter for subjectName nga mag return og String nga SubjectNAme
	public String getSubjectName() {
		return this.subjectName;
	}
}
