import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

class test {
    int numarr[];

    void getting(int narr[]) {
        this.numarr = narr;
        calc();
    }

    void calc() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numarr.length; i++) {

            int temp = numarr[i];
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            if (count % 2 == 0) {
                int first = numarr[i] / (int) Math.pow(10, count / 2);
                int sec = numarr[i] % (int) Math.pow(10, count / 2);
                int total = (first + sec) * (first + sec);

                if (total == numarr[i]) {
                    list.add(numarr[i]);
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        System.out.println("The tech numbers are: " + list);
    }
}

public class TechException {
    public static void main(String args[]) {
        int size = 0;
        System.out.println("Enter size of the array: ");
        Scanner data = new Scanner(System.in);
        size = data.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the numbers..");
        try {
            for (int i = 0; i <= size; i++) {
                arr[i] = data.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + "\nPls re-enter the numbers..");
            for (int i = 0; i < size; i++) {
                arr[i] = data.nextInt();
            }
        }

        test obj = new test();
        obj.getting(arr);

    }
}
