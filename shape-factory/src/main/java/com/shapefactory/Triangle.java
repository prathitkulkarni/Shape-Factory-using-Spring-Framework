package com.shapefactory;

public class Triangle extends Shape{
    @Override
    public float getArea() {
        return (0.5f * this.dimensionOne * this.dimensionTwo);
    }
}
