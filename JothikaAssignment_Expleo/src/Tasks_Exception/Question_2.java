package Tasks_Exception;
import java.util.*;


	// Custom Exception for Username
		class InvalidUsernameException extends Exception {
		    public InvalidUsernameException(String message) {
		        super(message);
		    }
		}

		// Custom Exception for Password
		class InvalidPasswordException extends Exception {
		    public InvalidPasswordException(String message) {
		        super(message);
		    }
		}

		public class Question_2 {

		    // Stored credentials
		    static String storedUsername = "User_123";
		    static String storedPassword = "Password@123";

		    // Username validation method
		    public static void validateUsername(String username) throws InvalidUsernameException {

		        if (username.length() < 6 || username.length() > 30) {
		            throw new InvalidUsernameException("Username must be 6 to 30 characters long");
		        }

		        if (!Character.isLetter(username.charAt(0))) {
		            throw new InvalidUsernameException("Username must start with a letter");
		        }

		        if (!username.matches("[a-zA-Z0-9_]+")) {
		            throw new InvalidUsernameException("Username can contain only letters, digits, and underscore");
		        }
		    }

		    // Password validation method
		    public static void validatePassword(String password) throws InvalidPasswordException {

		        if (password.length() < 8) {
		            throw new InvalidPasswordException("Password must be at least 8 characters long");
		        }

		        if (!password.matches(".*[a-z].*")) {
		            throw new InvalidPasswordException("Password must contain at least one lowercase letter");
		        }

		        if (!password.matches(".*[A-Z].*")) {
		            throw new InvalidPasswordException("Password must contain at least one uppercase letter");
		        }

		        if (!password.matches(".*[0-9].*")) {
		            throw new InvalidPasswordException("Password must contain at least one digit");
		        }

		        if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
		            throw new InvalidPasswordException("Password must contain at least one special character");
		        }
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Username: ");
		        String username = sc.nextLine();

		        System.out.print("Enter Password: ");
		        String password = sc.nextLine();

		        try {
		            // Validate username and password
		            validateUsername(username);
		            validatePassword(password);

		            // Check with stored values
		            if (username.equals(storedUsername) && password.equals(storedPassword)) {
		                System.out.println("Welcome " + username);
		            } else {
		                System.out.println("Invalid username or password");
		            }

		        } catch (InvalidUsernameException e) {
		            System.out.println("InvalidUsernameException: " + e.getMessage());

		        } catch (InvalidPasswordException e) {
		            System.out.println("InvalidPasswordException: " + e.getMessage());
		        }

		        sc.close();
		    }
		}
	


