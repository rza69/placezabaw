package pl.placezabaw.placezabaw;

/**
 * Created by Mateusz on 2017-05-27.
 */

public class Playground
{
    private int ID;
    private String Name;
    private String ImgSrc;
    private double Rate;
    private double Lat;
    private double Lng;


    public Playground() {
    }

    public Playground(int ID, String name, double lat, double lng,  double rate) {
        this.ID = ID;
        Lat = lat;
        Lng = lng;
        Name = name;
        Rate = rate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImgSrc() {
        return ImgSrc;
    }

    public void setImgSrc(String imgSrc) {
        ImgSrc = imgSrc;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLng() {
        return Lng;
    }

    public void setLng(double lng) {
        Lng = lng;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }
}
