import java.util.Scanner;

import java.util.ArrayList;

import java.lang.*;

class A implements Runnable {
    public void run() {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = data.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter numbers one by one..");
        for (int i = 0; i < size; i++) {
            arr[i] = data.nextInt();
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("Error occured in t1 thread..");
            e.printStackTrace();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i];
            int count = 0;
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            if (count % 2 == 0) {
                int first = arr[i] / (int) Math.pow(10, count / 2);
                int sec = arr[i] % (int) Math.pow(10, count / 2);
                int total = (first + sec) * (first + sec);

                if (total == arr[i]) {
                    list.add(arr[i]);
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        System.out.println("The tech numbers are: " + list);

        System.out.println("t2 thread terminated..");

    }
}

public class Techthread extends A {

    public void run() {
        A obj2 = new A();
        Thread t2 = new Thread(obj2);
        t2.start();
    }

    public static void main(String args[]) {
        Techthread obj1 = new Techthread();
        Thread t1 = new Thread(obj1);
        t1.start();
        try {
            t1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("t1 thread terminated..");

    }
}