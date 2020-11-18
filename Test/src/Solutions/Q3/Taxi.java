package Solutions;

class ExceedsLimit extends Exception {
    public ExceedsLimit(String s) {
        super(s);
    }
}
//---------------------------------------

// InsufficientFunds


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

    public void addPassengers(int amt) throws ExceedsLimit {
        if ((amt + passengers) > capacity) {
            throw new ExceedsLimit("Too Many Passengers");
            // Insufficient Room
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

