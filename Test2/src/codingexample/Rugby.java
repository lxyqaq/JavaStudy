package codingexample;

public class Rugby extends Footballer {

    public Rugby(String n, int a, String t, String hg, int sal, int number) {
        super(n, a, t, hg, sal, number);

    }

    public int readSalary() {
        return salary;
    }

    public String readSport() {
        return "Rugby";
    }

    public String readPosition() {

        if (number < 9) return "Forward";
        return "Back";
    }
}