import java.util.*;  

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);            
        System.out.println("input a month number:");
        int month = sc.nextInt();
        System.out.println("input a year:");
        int year = sc.nextInt();
        
        if (month == 1){
            System.out.println("january " + year + " has 31 days.");
        }
        else if (month == 3){
            System.out.println("march " + year + " has 31 days.");
        }
        else if (month == 5){
            System.out.println("may " + year + " has 31 days.");
        }
        else if (month == 7){
            System.out.println("july " + year + " has 31 days.");
        }
        else if (month == 8){
            System.out.println("august " + year + " has 31 days.");    
        }
        else if (month == 10){
            System.out.println("october " + year + " has 31 days.");
        }
        else if (month == 12){
            System.out.println("december " + year + " has 31 days.");
        }
        else if (month == 11){
            System.out.println("november " + year + " has 30 days.");
        }
        else if (month == 9){
            System.out.println("january " + year + " has 30 days.");
        }
        else if (month == 4){
            System.out.println("april " + year + " has 30 days.");
        }
        else if (month == 6){
            System.out.println("june " + year + " has 30 days.");
        }
        else if (month==2){
            
            if((year%400==0) || ((year%100!=0) && (year%4==0))){
                System.out.println("february " + year + " has 29 days.");
            }
            else {
                System.out.println("february " + year + " has 28 days.");
            }
        }   
    }
}




