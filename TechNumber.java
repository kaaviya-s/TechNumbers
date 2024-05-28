import java.util.*;

public class TechNumber {
    public static void main(String args[]) {
        int count = 0;
        Scanner data = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = data.nextInt();

        int temp = value;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 == 0) {
            int firstHalf = value / (int) Math.pow(10, count / 2);
            int secondHalf = value % (int) Math.pow(10, count / 2);

            int result = (firstHalf + secondHalf) * (firstHalf + secondHalf);

            if (result == value) {
                System.out.println(value + " is  an Tech number..!");
            } else {
                System.out.println(value + " is not an Tech number..!");
            }

        } else {
            System.out.println(value + " is not an Tech number..!");
        }
        data.close();
    }
}
