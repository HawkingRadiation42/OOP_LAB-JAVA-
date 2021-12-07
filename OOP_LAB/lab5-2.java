import java.util.*;
class Main{
    int areaPolygon(int a){
        System.out.println("area of square is: " + a*a);
        return 0;
    }
    int areaPolygon(int l, int b){
        System.out.println("area of square is: " + l*b);
        return 0;
    }
    int areaPolygon(float d1, float d2){
        System.out.println("area of square is: " + 0.5*(d1*d2));
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("To calculate the are of: ");
        System.out.println("enter any one of the following square|rectangle|rhombus:");
        String a =sc.nextLine();
        Main m = new Main();
        if(a.equals("square")){
            System.out.println("enter the value of side: ");
            int s = sc.nextInt();
            m.areaPolygon(s);
        }
        else if(a.equals("rectangle")){
            System.out.println("enter the value of length:");
            int l = sc.nextInt();
            System.out.println("enter the value of width:");
            int b = sc.nextInt();
            m.areaPolygon(l,b);
        }
        else{
            System.out.println("enter the value of diagonal:");
            float d1 = sc.nextFloat();
            System.out.println("enter the value of second diagonal:");
            float d2 = sc.nextFloat();
            m.areaPolygon(d1, d2);
        }
    }
}
