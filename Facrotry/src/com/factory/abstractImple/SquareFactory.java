package com.factory.abstractImple;

import com.factory.AbstractShapeFactory;
import com.factory.Shape;
import com.factory.shapeImple.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    public Shape factoryMethod() {
        return new Square();
    }
}
