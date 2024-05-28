import java.util.Scanner;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

class A {

    void calc(int vol) {
        File fileobj = new File("D://Techfilesample.txt");

        int temp = vol;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 == 0) {
            int firstHalf = vol / (int) Math.pow(10, count / 2);
            int secondHalf = vol % (int) Math.pow(10, count / 2);

            int result = (firstHalf + secondHalf) * (firstHalf + secondHalf);

            if (result == vol) {
                try {
                    if (fileobj.createNewFile()) {
                        FileWriter writing = new FileWriter("D://Techfilesample.txt");
                        writing.write(vol + " is a tech number..");
                        writing.close();
                    } else {
                        FileWriter writing = new FileWriter("D://Techfilesample.txt");
                        writing.write(vol + " is a not tech number..");
                        writing.close();
                    }

                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        } else {
            try {
                if (fileobj.createNewFile()) {
                    FileWriter writing = new FileWriter("D://Techfilesample.txt");
                    writing.write(vol + " is not a tech number..");
                    writing.close();
                } else {
                    FileWriter writing = new FileWriter("D://Techfilesample.txt");
                    writing.write(vol + " is not a tech number..");
                    writing.close();
                }

            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }

}

public class Techfile {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = data.nextInt();

        A obj = new A();
        obj.calc(num);
    }
}
