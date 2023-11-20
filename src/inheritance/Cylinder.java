package inheritance;

public class Cylinder extends Circle {
  private double height;
public Cylinder(double radius,double height){
    super(radius);
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
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
}

