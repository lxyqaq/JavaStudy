package codingexample;

public class Soccer extends Footballer {

    public Soccer(String n, int a, String t, String hg, int sal, int number) {
        super(n, a, t, hg, sal, number);
    }

    public String readSport() {
        return "Soccer";
    }

    public String readPosition() {
        if (number == 1) return "Goalkeeper";
        if (number < 6) return "Defender";
        if (number < 9) return "Midfield";
        return "Forward";
    }
}