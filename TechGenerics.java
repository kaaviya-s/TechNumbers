import java.util.*;

class Calc<T extends Number> {
    T dobj;

    Calc(T dobj) {
        this.dobj = dobj;
        toFindTech();
    }

    void toFindTech() {
        int count = 0;
        int num = dobj.intValue();
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        if (count % 2 == 0) {
            int firsthalf = num / (int) Math.pow(10, (count / 2));
            int scndhalf = num % (int) Math.pow(10, (count / 2));

            int total = (firsthalf + scndhalf) * (firsthalf + scndhalf);

            if (total == num) {
                System.out.println(num + " is a Tech number..\n");
            } else {
                System.out.println("It is not a Tech number..!");
            }
        } else {
            System.out.println("It is not a Tech number..!");
        }
    }
}

public class TechGenerics {
    public static void main(String args[]) {
        Scanner getData = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = getData.nextInt();
        Calc<Integer> obj = new Calc<Integer>(num);
    }
}
