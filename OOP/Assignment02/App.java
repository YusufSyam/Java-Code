package Assignment02;

public class App {
	
    public static void main(String[] args) throws Exception {
    	Login login = Login.getInstance();
        login.auth("naim", "Naim");
        login.status();
    }
}
