import java.util.*;
public class Main{
    int[][] f = new int[4][4];
    
    void check(int[][] b,int a[][])
    {
        
            for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                
                if(b[i][j]==0){
                    f[i][j]=0;
                }
                else{
                    f[i][j]=a[i][j];
                }
             }
            }
         
        
        System.out.println("Output Array");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
        System.out.print(f[i][j]+" ");
        }
        System.out.println();
        }
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        System.out.println("For input array");
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter element ["+i+"]["+j+"] : ");
                a[i][j]=sc.nextInt();
            }
        }
        int count_0=0,count_1 = 0;
        
        System.out.println("For input mask (Has to be a sparse Matrix)");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Enter element ["+i+"]["+j+"] : ");
                b[i][j]=sc.nextInt();
                
                if(b[i][j]==0)
                count_0++;
                
                else if(b[i][j]==1)
                count_1++;
                
                else{
                System.out.println("Wrong Input");
                System.exit(0);}
            }
        }
        
        if(count_0>count_1){
            System.out.println("Input Array : ");
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Input Mask : ");
            for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        Main obj=new Main();
        obj.check(b,a);
        }
    
   
        else{
         System.out.println("Not a sparse matrix");
         System.exit(0);
        }
    }
}
