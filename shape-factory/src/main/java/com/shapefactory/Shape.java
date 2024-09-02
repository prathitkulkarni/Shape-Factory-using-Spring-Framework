package com.shapefactory;

public abstract class Shape implements IShape{
    protected int dimensionOne;
    protected int dimensionTwo;

    @Override
    public void setDimensionOne(int dimensionOne) {
        this.dimensionOne = dimensionOne;
    }

    @Override
    public void setDimensionTwo(int dimensionTwo) {
        this.dimensionTwo = dimensionTwo;
    }

    @Override
    public int getDimensionOne() {
        return dimensionOne;
    }

    @Override
    public int getDimensionTwo() {
        return dimensionTwo;
    }
}
