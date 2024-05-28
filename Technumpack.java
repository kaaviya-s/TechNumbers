import java.util.*;
import techpackage.Tech;

public class Technumpack {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Package imported..!");
        System.out.println("Enter a number: ");
        int number = data.nextInt();

        Tech obj = new Tech();
        obj.calc(number);

    }
}
