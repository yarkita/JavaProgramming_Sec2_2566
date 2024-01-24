
public class PersonalInfo {
	private Person name; // object name reference class Person
	private Date bDay; // object name reference class Person
	private int personID; // declare a private attribute
	
	//Default constructor
	//Postcondition: firstName="", lastName="";
	//dMonth=1, dDay=1, dYear=1900
	//personID=0
	PersonalInfo(){
		name = new Person(); //firstName="", lastName="";
		bDay = new Date(); //dMonth=1, dDay=1, dYear=1900
		personID = 0;
	}
	
	//Constructor with parameter
	PersonalInfo(String first, String last, int month, int day, int year, int ID){
		name = new Person(first,last); //firstName=first, lastName=last;
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	//Method to set the personal information
	//invoke set method from class Person and class Date
	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first,last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	//Method to return the String of personal information
	public String toString() {
		return "Name: "+name+"\nDate of birth: "+bDay+"\nPersonal ID: "+personID;
	}
	
}
