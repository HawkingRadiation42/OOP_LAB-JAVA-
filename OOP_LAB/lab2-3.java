import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        char n=sc.next().charAt(0);
        
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i<=2&&j>=i&&j<=(5-i))
                System.out.print(n);
                else if(i>=3&&j>=5-i&&j<=i)
                System.out.print(n);
                else
                System.out.print("0");
            }
            System.out.println();
        }

    }
}
