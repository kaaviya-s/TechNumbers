import java.util.*;
import java.lang.*;
import java.io.*;

class Tech implements Cloneable {
    int num;

    Tech(int num) {
        this.num = num;
    }

    public Object clone() throws CloneNotSupportedException {
        return (Tech) super.clone();
    }

    void calc() {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 == 0) {
            int first = num / (int) Math.pow(10, count / 2);
            int sec = num % (int) Math.pow(10, count / 2);

            int total = (first + sec) * (first + sec);

            if (total == num) {
                System.out.println(num + " is a Tech number..");
            } else {
                System.out.println(num + " is not a Tech number..");
            }
        } else {
            System.out.println(num + " is not a Tech number..");
        }
    }
}

public class Techcloning {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter number: ");
        int val = data.nextInt();
        Tech obj1 = new Tech(val);
        try {
            Tech obj2 = (Tech) obj1.clone();

            obj2.calc();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Error occured..");
        }

    }
}