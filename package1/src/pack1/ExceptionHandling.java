package pack1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExceptionHandling {
	public boolean isValidAdhar(String adhar) throws InvalidAdharException {
		if(adhar.matches("[0-9]{12}")) {
			return true;
		}
		else {
			throw new InvalidAdharException("Entered adhar "+adhar+"is invalid");
		}
	}
	
	public boolean isvalidMail(String mail) {
		if(mail.matches("[a-z]{1}")){
			return true;
		}
		else {
			
		}
	}

}
