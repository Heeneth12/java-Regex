import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
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

}
