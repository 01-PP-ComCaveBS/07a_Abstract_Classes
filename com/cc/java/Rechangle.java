package com.cc.java;

public class Rechangle extends Shape{

private double height;
private double width;

public Rechangle(double height, double width) {
    this.height = height;
    this.width = width;



}



@Override
public double area() {
    return width * height;
}





}
