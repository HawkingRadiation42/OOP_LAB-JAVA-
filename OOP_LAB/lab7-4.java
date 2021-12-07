class Main{
    void common(int a[][], int b[][]){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(a[i][j]==b[i][j]){
                    System.out.println(a[i][j]);
                }
            }    
        }
    }
    public static void main(String args[]){
        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int b[][] = {
            {11,12,13,14},
            {5,16,17,18},
            {9,110,111,112},
            {131,14,151,161}
        };
        
        Main obj = new Main();
        obj.common(a, b);
        // System.out.println(obj.findMax(a));
        // System.out.println(obj.findMin(a));
    }
}




