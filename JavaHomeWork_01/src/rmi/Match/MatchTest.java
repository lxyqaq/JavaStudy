package rmi.Match;

import java.util.Scanner;

class Match {
    private int team1_score, team2_score;
    private String team1_name, team2_name;

    public Match(String t1, String t2) {
        this.team1_name = t1;
        this.team2_name = t2;
        this.team1_score = 0;
        this.team2_score = 0;
    }

    public void team1_goal() {
        this.team1_score++;

    }

    public void team2_goal() {
        this.team2_score++;

    }


    public String read_result() {
        String res = "\n";
        res += (team1_name + "    " + team2_name + "\n");
        res += ("  " + team1_score + "       " + team2_score) + "\n\n";
        return res;
    }
}

public class MatchTest {


    public static void main(String[] args) {

        Match m = new Match("Manu", "Chelsea");
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