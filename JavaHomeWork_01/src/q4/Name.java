package q4;

class Name {

    private String first, surname;

    public Name(String f, String s) {
        first = f;
        surname = s;
    }

    public void updateSurname(String s) {
        surname = s;
    }

    public void updateFirst(String f) {
        first = f;
    }

    public String readFirst() {

        return first;
    }

    public String readSurname() {

        return surname;
    }

    public void printFullName() {
        System.out.println("Name = " + first + " " + surname);
    }
}

