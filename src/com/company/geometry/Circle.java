package com.company.geometry;

public class Circle {
    private Point center;
    private double r;
    private boolean selected;

    public Circle() {
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Circle(Point center, double r, boolean selected) {
        this.center = center;
        this.r = r;
        this.selected = selected;
    }

    public double circleArea(){

        return this.r* this.r * Math.PI;
    }
    public double circleCircumference(){

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
        return selected;
    }

    public void setSlected(boolean slected) {
        this.selected = selected;
    }

}
