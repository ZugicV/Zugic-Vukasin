package com.company.geometry;

public class Point {
    private int x;
    private int y;
    private boolean selected;

    public Point() {
    }


    public Point(int prvaKoordinata, int drugaKoordinata) {
        this.x = prvaKoordinata;
        this.y = drugaKoordinata;
    }

    public Point(int prvaKoordinata, int drugaKoordinata, boolean selected) {
        this.x = prvaKoordinata;
        this.y = drugaKoordinata;
        this.selected = selected;
    }

    public double distance(int x , int y){
        return Math.sqrt(((this.x - x)^2)+((this.y - y)^2));
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
