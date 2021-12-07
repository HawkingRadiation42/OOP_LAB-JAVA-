
class Main{
    public static void main(String[] args){
        int a[]={33,3,4,5};
        int i,j, c;
        for(i = 0; i< 4; i++){
            for(j = i+1; j<4; j++){
                if(a[i]>a[j]){
                   c = a[i];
                   a[i] = a[j];
                   a[j] = c;
                }
            }
        }
        System.out.println("the new array is: ");
        for (i = 0; i < 4; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }
}




