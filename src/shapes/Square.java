package shapes;

class Square extends Quadrilateral {
    public void setWidth(double shapeWidth){
        this.width = shapeWidth;
    }
    public void setLength(double shapeWidth){
        this.width = shapeWidth;
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public double getArea() {
        return super.getArea();
    }

    public Square(double side){
        super(side,side);
    }
}
