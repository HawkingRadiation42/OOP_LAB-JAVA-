import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a password");
    String h = sc.nextLine();
    int l = h.length(),d=0,x=0;
    
    if(l>=10){
        for(int i=0;i<l;i++){
            int a=(int)(h.charAt(i));
                if((a>=97&&a<=122)||(a>=65&&a<=90)||(a>=48&&a<=57)){
                    if((a>=48&&a<=57)){
                        d++;
                    }
                }
                else{
                    System.out.println("Password is invalid");
                    //System.exit(0);
                }
        }
        if(d>=2){
    System.out.println("Password is valid");    
    }
    else{
        System.out.println("Password is invalid");
    }
    }
    else{
        System.out.println("Password is invalid");
    }
    }
}
