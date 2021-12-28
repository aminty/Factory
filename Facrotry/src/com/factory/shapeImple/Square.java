package com.factory.shapeImple;

import com.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside square :: draw");
    }
}
