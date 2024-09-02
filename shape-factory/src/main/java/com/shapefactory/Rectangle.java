package com.shapefactory;

public class Rectangle extends Shape{
    @Override
    public float getArea() {
        return (this.dimensionOne * this.dimensionTwo);
    }
}
