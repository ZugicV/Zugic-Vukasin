package com.company.geometry;

public class Rectangle {
    private Point pocetak;
    private double a;
    private double b;
    private boolean slected;

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
        return slected;
    }

    public void setSlected(boolean slected) {
        this.slected = slected;
    }
}
