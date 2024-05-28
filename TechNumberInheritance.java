import java.util.*;

class FindingTech {
    Scanner data = new Scanner(System.in);
    int original;

    FindingTech() {
        System.out.println("Using inheritance..");
        System.out.println("Enter a number: ");
        original = data.nextInt();

    }

}

class TechNumber extends FindingTech {

    void calc() {
        int count = 0;
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

public class TechNumberInheritance {
    public static void main(String args[]) {
        FindingTech obj = new TechNumber();
        TechNumber objtech = (TechNumber) obj;
        objtech.calc();

    }
}