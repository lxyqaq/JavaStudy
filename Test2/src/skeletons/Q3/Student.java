package skeletons.Q3;

class ExceedsLimit extends Exception {
    public ExceedsLimit(String s) {
        super(s);
    }
}
//---------------------------------------

// IncorrectYear


class Student {
    private String name;
    private String module;
    private int year;
    private int mark;

    public Student(String nm, String m, int y, int mk) {
        name = nm;
        module = m;
        year = y;
        mark = mk;
    }

    public void setYear(int m) throws ExceedsLimit {
        if (m < 1 || m > 4) {
            throw new ExceedsLimit("setyear error");
        } else {
            mark = m;
        }
    }

    public void resetMark() {
        mark = 0;
    }

    public String readName() {
        return name;
    }

    public String readModule() {
        return module;
    }

    public int readYear() {
        return year;
    }

    public int readMark() {
        return mark;
    }
}

