package serialization;


public class Team {
    private int gamesPlayed, points;

    public Team() {
        this.gamesPlayed = 0;
        this.points = 0;
    }

    public Team(String s, int i, int i1) {

    }

    public void win() {
        this.gamesPlayed++;
        this.points += 3;

    }

    public void loss() {
        this.gamesPlayed++;
    }


    public void draw() {
        this.gamesPlayed++;
        this.points++;
    }


    public void reset() {
        this.gamesPlayed = 0;
        this.points = 0;
    }

    public int readGamesPlayed() {
        return gamesPlayed;
    }


    public int readPoints() {
        return points;
    }

    public void printDetails() {
        System.out.println("\nTeam Details");
        System.out.println("============");
        System.out.println("Played:" + "  Points: ");
        System.out.println("  " + this.gamesPlayed + "      " + this.points);
        System.out.println();
    }
}
