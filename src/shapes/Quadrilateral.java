package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    double width = 5;
    double length = 6;


    public double getPerimeter() {
        return 2 * length + 2 * width;

    }

    public double getArea() {
        return length * width;
    }

    public void setWidth(double shapeWidth){
     this.width = shapeWidth;
    }



    public void setLength(double shapeLength){
    this.length = shapeLength;
    }


}
