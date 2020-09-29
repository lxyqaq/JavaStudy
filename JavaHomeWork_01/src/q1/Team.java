package q1;


public class Team {
    private Counter games_played;
    private Counter points;
    private String team_name;

    public Team(String nm, int gp, int pt) {
        this.team_name = nm;
        games_played = new Counter(gp);
        points = new Counter(pt);
    }

    public void win() {
        games_played.increment();
        points.increment();
        points.increment();
        points.increment();
    }


    public void print_details() {
        System.out.println("Team: " + team_name);
        System.out.println("Games Played: " + games_played.read_value());
        System.out.println("Points      : " + points.read_value());
    }

    public int readPlayed() {
        return games_played.read_value();
    }

    public int readPoints() {
        return points.read_value();
    }

    public void draw() {
        games_played.increment();
        points.increment();
    }

    public void loss() {
        games_played.increment();
    }

}

