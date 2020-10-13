package q3;

class PairDice {
    private Die d1;
    private Die d2;

    public PairDice(int dp1, int dp2) {
        d1 = new Die(dp1);
        d2 = new Die(dp2);
    }

    public void rollDice() {
        d1.roll();
        d2.roll();
    }

    public int readValue1() {
        return d1.getValue();
    }

    public int readValue2() {
        return d2.getValue();
    }

    public int sumDiceValues() {
        return d1.getValue() + d2.getValue();
    }

    public boolean valuesEqual() {
        return (d1.getValue() == d2.getValue()) ? true : false;
    }

}

