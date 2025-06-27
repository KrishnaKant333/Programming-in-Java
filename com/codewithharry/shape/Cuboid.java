package com.codewithharry.shape;

public class Cuboid extends Shape{
    public Cuboid(int dim1, int dim2, int dim3){
        super(dim1, dim2, dim3);
    }
    public int area(){
        return 2 * (this.dim1*this.dim2 + this.dim2*this.dim3 + this.dim1*this.dim3);
    }
    public int volume(){
        return this.dim1*this.dim2*this.dim3;
    }
}
