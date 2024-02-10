
public class Main {
    public static void main(String[] args) throws CustomException {

        UserData user = new UserData();

        user.firstName();
        user.LastName();
        user.validEmail();
        user.validNumber();

        System.out.println("data is successfuly verfied");

    }
}
