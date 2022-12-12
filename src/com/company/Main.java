package com.company;

import com.company.geometry.Circle;
import com.company.geometry.Donut;
import com.company.geometry.Point;
import com.company.geometry.Line;

public class Main {

    public static void main(String[] args) {
        Point tacka1 = new Point(5,6);
        Circle c3 = new Circle(tacka1,8);
        Donut d = new Donut(tacka1, 8,3);
        Donut d2 = new Donut(tacka1, 9,3);
        System.out.println(d2.equals(d));


    }
}
