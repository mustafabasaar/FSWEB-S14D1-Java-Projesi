package inheritance;

public class Circle {
   private double radius;

   public  Circle(double radius){
      this.radius=radiusCheck(radius);
   }

   public double getRadius(){
       return radius;
    }

   public double radiusCheck( double radius){
      if(radius<0){
        this.radius=0;
      }
      else {
         this.radius=radius;
      }
      return radius;
   }
public double setRadius(double radius){
      this.radius=radiusCheck(radius);
      return radius;
}
public double getArea(){
      return radius*radius*Math.PI;
}


}
