package shapes;

public class ShapesTest {
    public static void main(String[] args){
     Rectangle box1 = new Rectangle();
     Rectangle box2 = new Square();
     System.out.println(box1.getArea());

     System.out.println(box1.getPerimeter());

     System.out.println(box2.getArea());
     System.out.println(box2.getPerimeter());

     //Another way to save lines
       // Rectangle [] recs = {rec, sqr};
        // for(Rectangle r : recs){
        //System.out.println(r.getArea());
        //System.out.println(r.GetPerimeter());}
    }
}

