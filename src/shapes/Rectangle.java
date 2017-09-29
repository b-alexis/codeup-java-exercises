package shapes;

 class Rectangle extends Quadrilateral implements Measurable {

     public Rectangle(double length, double width){
         this.length=length;
         this.width =width;
     }

     public void setWidth(double shapeWidth){
         this.width = shapeWidth;
     }
     public void setLength(double shapeLength){
         this.length =shapeLength;
     }
}