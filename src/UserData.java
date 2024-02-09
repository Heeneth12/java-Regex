import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserData {

    public void validEmail() {

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
            System.out.println("in valid ");
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

    public void firstName() {

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
            System.out
                    .println("Invalid first name " + firstName
                            + " Please start with 'cao' and have a minimum length of 3 characters. ");
        }

    }

    public void LastName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Last name: ");
        String firstName = scanner.nextLine();

        // Define the regular expression for the first name
        String regex = "^[A-Z][a-z]{2,}$";
        // {2,}quantifer it sayes small letter atleast two or more
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid Last name! " + firstName);
        } else {
            System.out
                    .println("Invalid Last name " + firstName
                            + " Please start with 'cao' and have a minimum length of 3 characters. ");
        }

    }

    public void validPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password : ");
        String password = scanner.nextLine();

        // Define the regular expression for the first name
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        // {2,}quantifer it sayes small letter atleast two or more
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password! ");
        } else {
            System.out
                    .println("Invalid Password" + password);
        }

    }
}
