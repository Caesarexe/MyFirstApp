import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello User!");
        System.out.println("Please enter your first name:");
        System.out.println("");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();

        if (firstName.equalsIgnoreCase("Linus")) {
            System.out.println("Hello super brain, nicht");
        }
        else if (firstName.equalsIgnoreCase("Noah")) {
            System.out.println("Hello super brain, nicht");
        }
        else if (firstName.equalsIgnoreCase("Karsten")) {
            System.out.println("IntelliJ ist ja so ein Mist!");
        }
        else {
            System.out.println("Hello " + firstName );
        }
    }
}
