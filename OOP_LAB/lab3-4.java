class Main{
    public static void main(String args[])
    {
        
        String a[] = new String[]{"shrey", "khandelwal", "manipal"};
        String b[] = new String[]{"khandelwal", "to check", "manipl"};
        int x = -1;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(a[i]==b[j]){
                    System.out.println("true");
                    x++;
                }
            }
        }
        if(x < 0){
            System.out.println("false");
        }
    }
}







