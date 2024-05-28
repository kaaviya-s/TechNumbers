import java.util.*;

class Findings {
    int original;
    int count = 0;
    Scanner data = new Scanner(System.in);

    Findings() {
        System.out.println("Enter a number: ");
        this.original = data.nextInt();
    }

    void FindTech() {
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

public class TechNumberThis {
    public static void main(String srgs[]) {
        Findings obj = new Findings();
        obj.FindTech();
    }
}
