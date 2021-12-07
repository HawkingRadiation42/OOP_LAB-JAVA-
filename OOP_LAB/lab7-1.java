class Shape{
    void print(){
        System.out.println("this is shape.");
    }
}
class Rectangle extends Shape{
    void printrectangle(){
    System.out.println("this is rectangular shape");
    }
}
class Circle extends Shape{
    void printcircle(){
        System.out.println("this is circular shape.");    
    }
}
class Square extends Rectangle{
    void printsquare(){
        System.out.println("square is rectangle.");    
    }
}
class Main{
    public static void main(String args[]){
        Square s = new Square();
        s.print();
        s.printrectangle();
    }
}

