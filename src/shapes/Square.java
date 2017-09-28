package shapes;

public class Square extends Rectangle {


    @Override
    public int getArea() {
        return this.getLength() * this.getWidth();

    }

    @Override
    public int getPerimeter() {
        return this.getLength() * 4;
    }

    public Square(int side) {
        super(side, side);

    }


}
