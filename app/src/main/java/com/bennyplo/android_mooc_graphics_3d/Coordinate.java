package com.bennyplo.android_mooc_graphics_3d;
//*********************************************
//* Homogeneous coordinate in 3D space

public class Coordinate {
    public double x,y,z,w;
    public Coordinate()
    {//create a coordinate with 0,0,0
        x=0;y=0;z=0;w=1;
    }
    public Coordinate(double x,double y,double z, double w)
    {//create a Coordinate object
        this.x=x;this.y=y;this.z=z; this.w=w;
    }
    public void Normalise()
    {//to keep it as a homogeneous coordinate -> divide the coordinate with w and set w=1
        if (w!=0)
        {//ensure that w!=0
            x/=w;
            y/=w;
            z/=w;
            w=1;
        }else w=1;
    }
}
