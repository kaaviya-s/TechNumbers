import java.util.*;

interface Tech {
    
    static int Counting(int temp){
        int count=0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    static void print() {
        System.out.println("Using Interface..");
    }

    void findTech();
}

class ToFind implements Tech {
    public void findTech() {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter number: ");
        int original=data.nextInt();
        int temp = original;
        int count = 0;
        count=Tech.Counting(temp);
        

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

public class TechNumberInterface {
    public static void main(String args[]) {
        ToFind obj = new ToFind();
        Tech.print();
        obj.findTech();
        
    }
}