import java.util.*;  

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);            
        System.out.println("enter the number:");
        int num = sc.nextInt();
        int k = 1;
        for(int i = 1; i<=num ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(k + "  ");
                k++;
            }   
            System.out.println();
            
        }
        
        
    }
}



