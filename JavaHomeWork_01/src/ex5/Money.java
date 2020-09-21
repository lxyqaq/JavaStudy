package ex5;

class Money {

    private int euro, cent;

    public Money(int e, int c) {
        this.euro = e;
        this.cent = c;
    }

    public boolean sub(int e, int c) {
        int totalCent1 = this.total_in_cent();
        int totalCent2 = c + (e * 100);
        if (totalCent2 > totalCent1) {
            return false;
        } else {
            int t3 = totalCent1 - totalCent2;
            this.euro = t3 / 100;
            this.cent = t3 % 100;
            return true;
        }
    }

    /** 
     * @description How to return the total cent
     * @return total cent
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/9/21 12:52
     */
    private int total_in_cent() {
        return euro * 100 + cent;
    }

    public void incrementCent() {

    }

    public String readValue() {
        return "€: " + (euro + (double) cent / 100);
    }

    public void add(int e1, int c1) {
        this.euro = e1;
        this.cent = c1;
    }
} 



