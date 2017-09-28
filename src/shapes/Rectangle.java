package shapes;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }


    public int getPerimeter(){
        return (2 * length) + (2 * width);
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
}

