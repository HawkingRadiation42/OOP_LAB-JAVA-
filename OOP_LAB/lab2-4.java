import java.util.*;  

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);            
        int n=6;
        int a[] = new int[n+1];
        System.out.printf("enter the array");
        for(int j = 0; j <n; j++)
        {
            a[j] = sc.nextInt();
        }
        
        System.out.println("enter the number to be inserted: ");
        int num = sc.nextInt();
        System.out.println("enter the position: ");
        int p = sc.nextInt();
        
        for(int i= (n-1); i>=(p-1); i--){
            a[i+1] = a[i];
        }
        a[p - 1] = num;
        System.out.println("the new array is:");
        for(int i = 0; i<(n+1); i++){
            System.out.println(a[i]);
        }
        
    }
}





 