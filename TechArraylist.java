import java.util.ArrayList;
import java.util.Scanner;

interface A {
    Scanner data = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();

    void method(int size);
}

class Tocalc {
    void tech(ArrayList<Integer> list) {
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        for (int num : list) {
            int count = 0;
            int temp = num;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            // System.out.println(count);
            if (count % 2 == 0) {
                int firsthalf = num / (int) Math.pow(10, count / 2);
                int sechalf = num % (int) Math.pow(10, count / 2);
                int total = (firsthalf + sechalf) * (firsthalf + sechalf);

                if (total == num) {
                    finalList.add(num);

                } else {
                    continue;
                }
            } else {
                continue;
            }
        }

        System.out.println("The tech numbers are: " + finalList.toString());
    }
}

public class TechArraylist implements A {
    public void method(int size) {
        for (int i = 0; i < size; i++) {
            int val = data.nextInt();
            list.add(val);
        }
        Tocalc tc = new Tocalc();
        tc.tech(list);
    }

    public static void main(String[] args) {

        System.out.println("Enter size of the arraylist: ");
        int size = data.nextInt();
        System.out.println("Enter values..");

        TechArraylist obj = new TechArraylist();
        obj.method(size);
    }

}
