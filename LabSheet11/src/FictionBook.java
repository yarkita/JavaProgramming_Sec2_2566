import java.time.Year;
public class FictionBook implements Author , Book{

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title = title;
		this.publicYear = publicYear;
		author_name = null;
		email = null;
	}
	
	public void setAuthorName(String name) {
		author_name =name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		int space = author_name.indexOf(' ');
		if(space == -1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String toString() {
		return getTitle()+" write by "+getLastName().charAt(0)+"."+getFirstName()+
				"("+this.email+")\nPublished for "+totalPublicYear()+" years ";
	}

	public String getLastName() {
		int space = author_name.indexOf(' ');
		return (author_name.substring(space+1)).toUpperCase();
	}

	public String getFirstName() {
		int space = author_name.indexOf(' ');
		return (author_name.substring(0,space)).toUpperCase();
	}

	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowlives.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getTitle() {
		return this.title;
	}

	public int totalPublicYear() {
		return (Year.now().getValue())-publicYear;
	}
}
