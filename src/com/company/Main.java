package com.company;

import com.company.geometry.Circle;
import com.company.geometry.Point;
import com.company.geometry.Line;

public class Main {

    public static void main(String[] args) {
            Point p1 = new Point();
            Point p2 = new Point(3,7);
            Point p3 = new Point(3,7,true);

            Line l1 = new Line();
            Line l2 = new Line(p2,p3);
            Line l3 = new Line(new Point(3,2),new Point(5,6));
            Line l4 = new Line(new Point(),new Point());

            Circle c1 = new Circle(new Point(5,9),5,true);
            Circle c2 = new Circle(p2,5,true);

    }
}
