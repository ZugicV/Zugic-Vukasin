package com.company.geometry;

public class Point {
    private int x;
    private int y;
    private boolean selected;

    public Point() {
    }


    public Point(int XKoordinata, int YKoordinata) {
        this.x = XKoordinata;
        this.y = YKoordinata;
    }

    public Point(int XKoordinata, int YKoordinata, boolean selected) {
        this.x = XKoordinata;
        this.y = YKoordinata;
        this.selected = selected;
    }

    public double distance(int x , int y){
        return Math.sqrt(((this.x - x)^2)+((this.y - y)^2));
    }

    public String toString(){
        return x+" "+y+" "+selected;
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
