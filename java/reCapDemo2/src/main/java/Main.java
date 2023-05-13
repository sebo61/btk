import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double myList[] = new double[4];

        myList[0] = 1.2;
        myList[1] = 2.3;
        myList[2] = 4.5;
        myList[3] = 5.6;

        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            if (max < number) {
                max = number;
            }

            total += number;
            System.out.println(number);

        }
        System.out.println(total);
        System.out.println("en büyük sayı= " + max);

        Scanner input=new Scanner(System.in);
        System.out.println("gir:");
        String names=input.next();
        System.out.println(names);


    }
}
