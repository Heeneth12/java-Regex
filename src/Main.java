import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
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
}
