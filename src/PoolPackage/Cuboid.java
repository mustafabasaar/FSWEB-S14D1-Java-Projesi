package PoolPackage;

public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width,double length,double height){
        super(width,length);
        this.height=checkHeight(height);
    }
    public double checkHeight(double height){
        if(height<0){
            this.height=0;
        }
        else {
            this.height=height;
        }
        return height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
