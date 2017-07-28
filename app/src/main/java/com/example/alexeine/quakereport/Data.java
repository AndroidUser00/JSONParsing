package com.example.alexeine.quakereport;

/**
 * Created by Alexeine on 28-07-2017.
 */

public class Data {
    double mag;
    String uri;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    String place;
    String date;
    long timeml;

    public long getTimeml() {
        return timeml;
    }

    public void setTimeml(long timeml) {
        this.timeml = timeml;
    }

    public double getMag() {
        return mag;
    }

    public void setMag(double mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String  getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Data(double mag, String place, long timeml,String uri) {

        this.mag = mag;
        this.place = place;
        this.uri= uri;
        this.date = date;
        this.timeml = timeml;
    }
}
