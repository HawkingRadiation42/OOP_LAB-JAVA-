import java.util.*;

class Cube{
    void findVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the area of side: ");
        int s = sc.nextInt();
        System.out.println("the volume of cube is: " + (s*s*s));
    }
}
class Cone extends Cube{
    @Override
    void findVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius: ");
        double r = sc.nextDouble();
        System.out.println("enter the value of length ");
        double l = sc.nextDouble();
        System.out.println("the volume of cone is: " + (3.14*(r*r)*l)/3);
    }
}

class Sphere extends Cone{
    @Override
    void findVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius: ");
        Double r = sc.nextDouble();
        System.out.println("the volume of sphere is: " + 1.33*(3.14)*(r*r*r));
    }
}

class Cylinder extends Sphere{
    @Override
    void findVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of radius: ");
        Double r = sc.nextDouble();
        System.out.println("enter the value of length: ");
        Double l = sc.nextDouble();
        System.out.println("the volume of cylinder is: " + (3.14)*(r*r)*l);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Cylinder cy = new Cylinder();
        Sphere sp = new Sphere();
        Cone co = new Cone();
        Cube cu = new Cube();
        
        System.out.println("To calculate the volume of: ");
        System.out.println("enter any one of the following: cube|sphere|cone|cylinder:");
        String a =sc.nextLine();
        
        if(a.equals("cone")){
            co.findVolume();
        }
        else if(a.equals("sphere")){
            sp.findVolume();
        }
        else if(a.equals("cylinder")){
            cy.findVolume();
        }
        else{
            cu.findVolume();
        }
  
    }
}




