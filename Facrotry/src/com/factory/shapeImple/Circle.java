package com.factory.shapeImple;

import com.factory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside circle :: draw");
    }
}
