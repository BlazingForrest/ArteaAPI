import arteaAPI.IFTTT;

public class Tester {

	public static void main(String[] args) {
		String[] values = {"1", "2"};
		IFTTT.sendWebHook("new_user_signup", "oyqV7ofRXJqPIk_4IzDAOO2FXbdmoxLZzKGMJdn8ki8", values);
	}

}
