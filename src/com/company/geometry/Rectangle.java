package com.company.geometry;

public class Rectangle {
    private Point pocetak;
    private double width;
    private double height;
    private boolean selected;

    public Rectangle() {
    }

    public Rectangle(Point pocetak, double a, double b) {
        this.pocetak = pocetak;
        this.width = a;
        this.height = b;
    }

    public Rectangle(Point pocetak, double a, double b, boolean slected) {
        this.pocetak = pocetak;
        this.width = a;
        this.height = b;
        this.selected = selected;
    }

    public double rectangleArea(){

        return width * height;
    }
    public double rectangleCircumference(){

        return 2* width + 2* height;
    }


    public Point getPocetak() {
        return pocetak;
    }

    public void setPocetak(Point pocetak) {
        this.pocetak = pocetak;
    }

    @Override
    public String toString() {
        return "Upper left point: "+ pocetak + "width: " + width + "height" + height;
    }


    @Override
    public boolean equals(Object objR){
        if (objR instanceof Rectangle){
            Rectangle temp = (Rectangle)objR;
            if(pocetak.equals(temp.pocetak) && width == temp.width && height == temp.height){
                return true;
            }
        }
        return false;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isSlected() {
        return selected;
    }

    public void setSlected(boolean slected) {
        this.selected = slected;
    }
}
