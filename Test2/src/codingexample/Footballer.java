package codingexample;

public class Footballer {
    private String name;
    private int age;
    private Team team;
    protected int salary;
    protected int number;

    public Footballer(String n, int a, String t, String hg, int sal, int no) {
        name = n;
        age = a;
        team = new Team(t, hg);
        salary = sal;
        number = no;

    }

    public String readName() {
        return name;
    }

    public int readAge() {
        return age;
    }

    public String readTeam() {
        return team.readName();
    }

    public String readHomeGround() {
        return team.readGround();
    }

    public int readSalary() {
        return salary;
    }

    public String readSport() {
        return "Footballer";
    }

    public String readPosition() {
        return "Unknown";
    }

    public int readNumber() {
        return number;
    }
}