package Tasks_Exception;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

// Custom Exception for Employee Number
class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String msg) {
        super(msg);
    }
}

// Custom Exception for Date Validation
class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String msg) {
        super(msg);
    }
}

// Employee Class
class Employee {
    int empCode;
    String name;
    LocalDate dob;
    LocalDate doj;

    public Employee(int empCode, String name, LocalDate dob, LocalDate doj) {
        this.empCode = empCode;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
    }

    // Method to calculate experience
    public int getExperience() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(doj, currentDate).getYears();
    }

    // Display details
    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Date of Joining: " + doj);
        System.out.println("Experience: " + getExperience() + " years");
    }
}

public class Question_3 {
    // Validate employee code
    public static void validateEmpCode(int code) throws InvalidEmpNumberException {
        if (code <= 0) {
            throw new InvalidEmpNumberException("Employee code must be a positive integer");
        }
    }

    // Validate dates
    public static void validateDates(LocalDate dob, LocalDate doj)
            throws InvalidDateOfJoinException {
        if (!dob.isBefore(doj)) {
            throw new InvalidDateOfJoinException("DOB must be before Date of Joining");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter Employee Code: ");
            int code = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter DOB (yyyy-mm-dd): ");
            LocalDate dob = LocalDate.parse(sc.nextLine());

            System.out.print("Enter DOJ (yyyy-mm-dd): ");
            LocalDate doj = LocalDate.parse(sc.nextLine());

            // Validations
            validateEmpCode(code);
            validateDates(dob, doj);

            // Create object
            Employee emp = new Employee(code, name, dob, doj);

            // Display
            emp.display();

        } catch (InvalidEmpNumberException e) {
            System.out.println("InvalidEmpNumberException: " + e.getMessage());

        } catch (InvalidDateOfJoinException e) {
            System.out.println("InvalidDateOfJoinException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input format (use yyyy-mm-dd for dates)");
        }

        sc.close();
    }
}
