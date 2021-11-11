package Assignment02;

import java.util.NoSuchElementException;

public class Login {
	
	private static Login login;
	private User user;
	private UserDetail userDetail;
	private DataSource dataSource;
	
	private Login() {
		dataSource= dataSource.getInstance();
	}
	
	public static Login getInstance() {
		 if (login == null) {
            login = new Login();
        }

        return login;
		}
	
	public void auth(String userName, String password) throws Exception{
		user = dataSource.getUser(userName);
            if (user.checkPass(password)) {
                userDetail = user.getUserDetail();
				System.out.println("yes");
            } else {
                System.out.println("Wrong Password");
            }
	}
	
	public void status() {
	//	System.out.println("Name\t\t:"+userDetail.getName()+"\nEmail\t\t:"+userDetail.getEmail()+"\nDate of Birth\t: "+userDetail.getDateOfBirth()+"\nUser Name\t: "+user.getUserName()+"\nPassword\t: "+user.getPassword());
	}
	
}

