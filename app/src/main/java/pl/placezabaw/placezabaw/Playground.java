package pl.placezabaw.placezabaw;

import android.graphics.Bitmap;

/**
 * Created by Mateusz on 2017-05-27.
 */

public class Playground
{
    private String ID;
    private String Name;
    //private Bitmap Image;
    private Rate Rate;
    private double Lat;
    private double Lng;

    public Playground() {
    }

    public Playground(String ID, String name, double lat, double lng,  Rate rate) {
        Lat = lat;
        Lng = lng;
        Name = name;
        Rate = rate;
    }

    /*public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Bitmap getImage() {
        return Image;
    }

    public void setImage(Bitmap image) {
        Image = image;
    }*/

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

    public pl.placezabaw.placezabaw.Rate getRate() {
        return Rate;
    }

    public void setRate(pl.placezabaw.placezabaw.Rate rate) {
        Rate = rate;
    }
}
