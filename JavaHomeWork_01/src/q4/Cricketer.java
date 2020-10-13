package q4;

public class Cricketer {
    private Name name;
    private String club;
    private int runs;

    public Cricketer(String f, String s, String c) {
        name = new Name(f, s);
        this.club = c;
    }

    public String readFullName() {
        return name.readFirst() + " " + name.readSurname();
    }


    public void updateSurname(String text) {
        name.updateSurname(text);
    }

    public void addRuns(int r) {
        this.runs = r;
    }

    public String readClub() {
        return club;
    }

    public int readRuns() {
        return runs;
    }

    public void updateFirstName(String text) {
        name.updateFirst(text);
    }
}
