import java.util.*;

abstract class A {
    int temp;

    void print(){
        System.out.println("Used Abstract class..!");
    }

    abstract void findEqual();
}

class Equals extends A {
    int count = 0,original;

    Equals(int num) {
        original = num;
    }

    void findEqual() {
        temp = original;
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

public class TechNumberAbstract {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = data.nextInt();
        A obj = new Equals(value);
        obj.findEqual();
        obj.print();

        data.close();
    }
}
