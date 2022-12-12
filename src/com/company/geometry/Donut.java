package com.company.geometry;

public class Donut extends Circle{
    private double innerR;


    public Donut(){

    }

    public Donut(double innerR) {
        this.innerR = innerR;
    }

    public Donut(Point center, double r, double innerR) {
        super(center, r);
        this.innerR = innerR;
    }

    public Donut(Point center, double r, boolean selected, double innerR) {
        super(center, r, selected);
        this.innerR = innerR;
    }

    @Override
    public double area(){

        return super.area()- innerR*innerR*Math.PI;
    }
    @Override
    public double circumference(){

        return super.circumference()+innerR*2* Math.PI;
    }
    @Override
    public String toString(){
        return super.toString() +"innerR:" + innerR;
    }
    @Override
    public boolean equals(Object objC){
        if (objC instanceof Donut){
            Donut temp = (Donut) objC;
            if (super.equals(temp) && innerR == temp.innerR){
                return true;
            }
        }
        return false;
    }
    public double getInnerR() {
        return innerR;
    }

    public void setInnerR(double innerR) {
        this.innerR = innerR;
    }
}
