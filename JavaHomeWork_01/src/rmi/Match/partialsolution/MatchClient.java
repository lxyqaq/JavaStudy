package rmi.Match.partialsolution;

import java.util.Scanner;

import java.rmi.*;

public class MatchClient {


    public static void main(String[] args) throws Exception {

        String url = "rmi:///";
        Match m = (Match) Naming.lookup(url + "toaster");
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        while (choice != 4) {
            System.out.println();
            System.out.println("1.Team 1 Score");
            System.out.println("2.Team 2 Score");
            System.out.println("3.Print_Score");
            System.out.println("4.Exit");

            System.out.print("\nPlease enter a value-->");
            choice = sc.nextInt();
            if (choice == 1) {
                m.team1_goal();
            } else if (choice == 2) {
                m.team2_goal();

            } else if (choice == 3) {
                String res = m.read_result();
                System.out.println(res);
            }

        }  // end while
    }

}