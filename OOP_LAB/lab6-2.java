class Main{
    void ifPalindrome(int n){
        int z=n, rem;    
        int sum=0;
        while(n>0){    
            rem=n%10; 
            sum=(sum*10)+rem;    
            n=n/10;    
        }
        if(sum==z){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome ");
        }
    }
    public static void main(String args[]){
        Main obj = new Main();
        int n = 464;
        obj.ifPalindrome(n);   
    }
}



