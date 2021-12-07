
import java.util.*;
class Check{
    
    void type(int a,int b){
        if(a+b==90||a+b==135){
            System.out.println("Right Angled Triangle");
        }
        else if(a==60&&b==60){
            System.out.println("Equilateral Triangle");
        }
        else{
            System.out.println("Scalene Triangle or other type of triangle ");
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Check c = new Check();
        c.type(a,b);
    }
}


