package codingexample;


public class Team {
    private String name;
    private String ground;

    public Team(String n, String g) {
        name = n;
        ground = g;
    }

    public String readName() {
        return name;
    }

    public String readGround() {
        return ground;
    }
}

