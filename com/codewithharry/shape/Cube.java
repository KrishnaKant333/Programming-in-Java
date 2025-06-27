package com.codewithharry.shape;

public class Cube extends Shape{
    public Cube(int dim1){
        super(dim1, -1, -1);
    }
    public int area(){
        return 6*this.dim1;
    }
    public int volume(){
        return this.dim1*this.dim1*this.dim1;
    }
}
