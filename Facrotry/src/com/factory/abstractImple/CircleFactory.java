package com.factory.abstractImple;

import com.factory.AbstractShapeFactory;
import com.factory.Shape;
import com.factory.shapeImple.Circle;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}
