package webapp;

public class UserValidationService {
	public boolean isUserValid(String user , String password){
		if(user.equals("RaminTagizade") && password.equals("dummy"))
			return true;
		return false;
	}
}
