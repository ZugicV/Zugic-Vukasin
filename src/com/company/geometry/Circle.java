package com.company.geometry;

public class Circle {
    private Point center;
    private double r;
    private boolean slected;

    public double area(){

        return this.r* this.r * Math.PI;
    }
    public double circumference(){

        return this.r*2* Math.PI;
    }
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public boolean isSlected() {
        return slected;
    }

    public void setSlected(boolean slected) {
        this.slected = slected;
    }

}
