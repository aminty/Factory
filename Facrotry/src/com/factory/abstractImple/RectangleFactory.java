package com.factory.abstractImple;

import com.factory.AbstractShapeFactory;
import com.factory.Shape;
import com.factory.shapeImple.Rectangle;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    public Shape factoryMethod() {
        return new Rectangle();
    }
}
