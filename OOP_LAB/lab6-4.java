import java.util.*;
class Rectangle{
    int length,breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void area(){
     System.out.println("Area of the rectangle is : "+(length*breadth));
    }
    void perimeter(){
     System.out.println("Perimeter of the rectangle is : "+(2*(length+breadth)));
    }
}
class Square extends Rectangle{
    int s;
    Square(int s)
    {
        super(s,s);
        this.s=s;
    }
    void area(){
     System.out.println("Area of the square is : "+(s*s));
    }
    void perimeter(){
     System.out.println("Perimeter of the square is : "+(4*s));
    }
}
public class Main{
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle(10,20);
        Square obj = new Square(10);
        obj1.area();
        obj1.perimeter();
        obj.area();
        obj.perimeter();
    }
}

