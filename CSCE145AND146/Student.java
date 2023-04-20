// Made By Damian Sclafani
package CSCE145AND146;

public class Student extends Person {
	
	private int studentID;
	private double gpa;
	private String major;
	
	//default constructor
	public Student()
	{
		super();	//calls the parent's default constructor
		this.studentID = 1;
		this.gpa = 4;
		this.major = "no major selected";
	}
	
	//parameterized constructor
	public Student(String xName, int xAge, int xStudentID, double xGpa, String xMajor)
	{
		super(xName, xAge);		//call to the parent's parameterized constructor
		this.setStudentID(xStudentID);
		this.setGpa(xGpa);
		this.setMajor(xMajor);
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public double getGpa()
	{
		return this.gpa;
	}
	
	public String getMajor()
	{
		return this.major;
	}
	
	public void setStudentID(int xStudentID)
	{
		if(xStudentID > 0)
		{
			this.studentID = xStudentID;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setGpa(double xGpa)
	{
		if(xGpa > 0.0 && xGpa <= 4.0)
		{
			this.gpa = xGpa;
		}
		else
		{
			System.out.println("ERROR");
		}
	}
	
	public void setMajor(String xMajor)
	{
		if(xMajor.equalsIgnoreCase("Computer Science")
				|| xMajor.equalsIgnoreCase("Exersice Science")
				|| xMajor.equalsIgnoreCase("Computer Engineering")
				|| xMajor.equalsIgnoreCase("Nursing")
				|| xMajor.equalsIgnoreCase("Business"))
		{
			this.major = xMajor;
		}
		else
		{
			System.out.println("INVALID MAJOR");
		}
	}
	
	//method overriding - methods with the same signature but different methodality
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Student ID: " + this.studentID +
				"\nGPA: " + this.gpa +
				"\nMajor: " + this.major);
	}
	
	
}
