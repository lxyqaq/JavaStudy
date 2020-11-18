package Q3Skeleton;
//---------------------------------------

class TaxiFull extends Exception {

    public TaxiFull(String s) {
        super(s);
    }
}


public class Taxi {
    private String number;
    private String driver;
    protected int passengers;
    private int capacity;

    public Taxi(String n, String d, int cap) {
        number = n;
        driver = d;
        passengers = 0;
        capacity = cap;
    }

    public void addPassengers(int amt) throws TaxiFull {
        if ((amt + passengers) > capacity) {
            throw new TaxiFull("Full");
        } else {
            passengers += amt;
        }
    }

    public void reachDestination() {
        passengers = 0;
    }

    public int readPassengers() {
        return passengers;
    }

    public int readCapacity() {
        return capacity;
    }

    public int readAvailableSpaces() {
        return capacity - passengers;
    }
}

