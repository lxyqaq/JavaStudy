package ex3;

import java.util.Scanner;

public class BoatClub {

    //Total number of boats
    int totalBoats;

    //Number of boats hired
    int boatsHired;

    public BoatClub(int t) {
        this.totalBoats = t;
    }


    /**
     * @return true:hired boat successful false:Failed to hire boat
     * @description hired boats
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/9/21 00:36
     */
    public boolean hireBoat() {
        if (totalBoats > boatsHired) {
            boatsHired++;
            readHired();
            return true;
        } else {
            return false;
        }
    }


    /**
     * @return true:return successful false:failed to return boat
     * @description Return the boat
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/9/21 00:39
     */
    public boolean returnBoat() {
        if (boatsHired > 0) {
            boatsHired--;
            readHired();
            readAvailable();
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the number of boats available
     * @description How to display the number of boats available
     * @author Xiangyu Liu @email A00279565@student.ait.ie
     * @date 2020/9/21 00:42
     */
    public int readAvailable() {
        return this.totalBoats - this.boatsHired;
    }

    public int readTotal() {
        return totalBoats;
    }

    public int readHired() {
        return boatsHired;
    }

}
