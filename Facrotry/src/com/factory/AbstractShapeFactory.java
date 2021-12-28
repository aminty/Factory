package com.factory;

import com.factory.Shape;

public abstract class AbstractShapeFactory {
     public abstract Shape factoryMethod();

     public Shape getShape() {
         return factoryMethod();
     }
}
