import java.util.*;

class FindEqual {
    int original, count = 0;

    FindEqual(int num) {
        original = num;
    }

    public void calc() {
        int temp = original;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 == 0) {
            int firstHalf = original / (int) Math.pow(10, count / 2);
            int secondHalf = original % (int) Math.pow(10, count / 2);

            int result = (firstHalf + secondHalf) * (firstHalf + secondHalf);

            if (result == original) {
                System.out.println(original + " is  an Tech number..!");
            } else {
                System.out.println(original + " is not an Tech number..!");
            }

        } else {
            System.out.println(original + " is not an Tech number..!");
        }

    }
}

public class TechNumberClass {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = data.nextInt();
        FindEqual obj = new FindEqual(value);
        obj.calc();
        data.close();

    }
}
