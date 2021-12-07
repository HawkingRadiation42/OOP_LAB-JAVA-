class Main{
    int findMax(int a[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(max<a[i][j]){
                    max= a[i][j];
                }
            }    
        }
        return max;
    }
    int findMin(int a[][]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(min>a[i][j]){
                    min = a[i][j];
                }
            }    
        }
        return min;
    }
    public static void main(String args[]){
        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        Main obj = new Main();
        obj.findMax(a);
        System.out.println(obj.findMax(a));
        System.out.println(obj.findMin(a));
    }
}


