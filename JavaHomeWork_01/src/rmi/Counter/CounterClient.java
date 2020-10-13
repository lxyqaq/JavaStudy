package rmi.Counter;

import java.rmi.*;
import java.util.Scanner;

public class CounterClient {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String url = "rmi:///";
        Counter c = (Counter) Naming.lookup(url + "toaster");

        int aChoice = 1;
        while (aChoice != 4) {
            System.out.println("Counter Application");
            System.out.println("*******************");
            System.out.println("1.Increment");
            System.out.println("2.Decrement");
            System.out.println("3.Read Value");

            aChoice = sc.nextInt();

            if (aChoice == 1) {
                c.increment();
            } else if (aChoice == 2) {
                c.decrement();
            } else if (aChoice == 3) {
                int s = c.readValue();
                System.out.println("The value is: " + s);
            }
        }

    }
}
