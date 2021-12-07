class Main{
    public static void main(String[] args){
        String a[] = new String[]{"shrey", "jaipur", "manipal", "university", "shrey", "manipal"}; 
        for (int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if (a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }    
        }
    }
}




