package shapes;

 public class Rectangle extends Quadrilateral implements Measurable {

     public Rectangle(double length, double width) {
         super(length, width);
     }

     @Override
     public double getPerimeter() {
         return this.length * 2 + this.width * 2;
     }

     @Override
     public double getArea() {
         return this.length * this.width;
     }

     @Override
     public void setWidth(double shapeWidth) {
         super.setWidth(shapeWidth);
     }

     @Override
     public void setLength(double length) {
         super.setLength(length);
     }
 }