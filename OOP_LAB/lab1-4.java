import java.util.*;  
class Main{
    public static int convert(int hours){
        int minutes;
        minutes = hours * 60;
        return minutes; 
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);            
        System.out.println("enter the number of hours");
        int hours = sc.nextInt();
        int m = convert(hours);
        System.out.println(m);
    }
}
