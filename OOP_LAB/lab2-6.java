
class Main{
    public static void main(String[] args){
        int [] k = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        int last , n;
        
        for (int i = 0; i < 2; i++) {
 			n = k.length;
            last = k[n-1];
            
            for(int j = n-2; j>=0; j--){
                k[j+1] = k[j];
            }
            k[0] = last;
		}
		
        System.out.print("the new array: ");
        for (int i = 0; i < k.length; i++){
            System.out.print(k[i] + " ");
        }
    }
}




