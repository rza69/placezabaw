package pl.placezabaw.placezabaw;

/**
 * Created by Mateusz on 2017-06-22.
 */

public class Rate {
 //   public String ID;
   // public String playgroundID;
    private int rateSum;
    private int count;

    public Rate(String ID, int count, String playgroundID, int rateSum) {
        this.count = count;
        //this.ID = ID;
        //this.playgroundID = playgroundID;
        this.rateSum = rateSum;
    }

    public Rate() {
    }

   /*public String getID() {
        return ID;
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPlaygroundID() {
        return playgroundID;
    }

    public void setPlaygroundID(String playgroundID) {
        this.playgroundID = playgroundID;
    }*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRateSum() {
        return rateSum;
    }

    public void setRateSum(int rateSum) {
        this.rateSum = rateSum;
    }
}
