package com.factory.shapeImple;

import com.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside rectangle :: draw");
    }
}
