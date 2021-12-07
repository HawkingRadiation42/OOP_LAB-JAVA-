class Main{
    public static void main(String args[]){
        String [] a = new String[]{"anaconda", "app", "mouse", "ant", "Ant"};
       
        int n = a.length;
        for(int i = 0; i<n; i++){
            if(a[i].charAt(0) == 97){
                int v = a[i].length();
                if(v==3){
                    System.out.println(a[i]);
                }
            }
        }
    }
}

