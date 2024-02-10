import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserData {

    public void validEmail() throws CustomException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the E-mail: ");
        String inputEmail = scanner.nextLine();

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        // ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputEmail);

        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            throw new CustomException("Invalid Email : " + inputEmail);
        }

    }

    public void validNumber() {

        System.out.println("Enter the mobile number : ");
        Scanner scanner = new Scanner(System.in);

        String mobileNum = scanner.nextLine();
        String regex = "^91\\s[0-9]{10,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNum);

        System.out.println(matcher.matches() ? "valid number" : "Invalid mobile number");
    }

    public void firstName() throws CustomException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Define the regular expression for the first name
        String regex = "^[A-Z][a-z]{2,}$";
        // {2,}quantifer it sayes small letter atleast two or more
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid first name! " + firstName);

        } else {
            throw new CustomException("Invalid first name: " + firstName);

        }

    }

    public void LastName() throws CustomException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Last name: ");
        String LastName = scanner.nextLine();

        // Define the regular expression for the first name
        String regex = "^[A-Z][a-z]{2,}$";
        // {2,}quantifer it sayes small letter atleast two or more
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(LastName);

        if (matcher.matches()) {
            System.out.println("Valid Last name! " + LastName);
        } else {
            throw new CustomException("Invalid first name: " + LastName);
        }

    }

    public void validPassword() throws CustomException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password : ");
        String password = scanner.nextLine();

        // Define the regular expression for the first name
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_+=]).{8,}$";
        // {2,}quantifer it sayes small letter atleast two or more
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password! ");
        } else {
            throw new CustomException("Invalid first name: " + password);
        }

    }
}
