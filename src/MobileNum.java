import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNum {

    public void validNumber() {

        System.out.println("Enter the mobile number : ");
        Scanner scanner = new Scanner(System.in);

        String mobileNum = scanner.nextLine();
        String regex = "^91\\s[0-9]{10,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNum);

        System.out.println(matcher.matches() ? "valid number" : "Invalid mobile number");
    }

}
