package PoolPackage;

public class Rectangle {
   private double width;
    private double length;
public Rectangle(double width,double length){
    this.width=widthCheck(width);
    this.length=lengthCheck(length);
}
    public double widthCheck(double width){
        if(width <0){
            this.width=0;
        }
        else {
            this.width = width;
        }
          return width;
    }
    public double lengthCheck(double length){
          if(length<0){
            this.length=0;
        }
          else{
              this.length=length;
          }
          return length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = lengthCheck(length);
    }

    public void setWidth(double width) {
        this.width = widthCheck(width);
    }

    public double getArea(){
        return width*length;
    }
}
