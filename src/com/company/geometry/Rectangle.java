package com.company.geometry;

public class Rectangle {
    private Point pocetak;
    private double a;
    private double b;
    private boolean selected;

    public Rectangle() {
    }

    public Rectangle(Point pocetak, double a, double b) {
        this.pocetak = pocetak;
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point pocetak, double a, double b, boolean slected) {
        this.pocetak = pocetak;
        this.a = a;
        this.b = b;
        this.selected = selected;
    }

    public double rectangleArea(){

        return a*b;
    }
    public double rectangleCircumference(){

        return 2*a + 2*b;
    }

    public Point getPocetak() {
        return pocetak;
    }

    public void setPocetak(Point pocetak) {
        this.pocetak = pocetak;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean isSlected() {
        return selected;
    }

    public void setSlected(boolean slected) {
        this.selected = slected;
    }
}
