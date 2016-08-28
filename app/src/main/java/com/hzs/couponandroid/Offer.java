package com.hzs.couponandroid;

/**
 * Created by Ishaan 2 on 8/28/2016.
 */
public class Offer {

    private String from;
    private String text;
    private String exp;
    private String points;
    private String type;

    public Offer(String from, String text, String type, String exp, String points) {
        this.from = from;
        this.text = text;
        this.type = type;
        this.exp = exp;
        this.points = points;
    }

    public Offer() {
        this.from = "";
        this.text = "";
        this.type = "";
        this.exp = "";
        this.points = "";
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
