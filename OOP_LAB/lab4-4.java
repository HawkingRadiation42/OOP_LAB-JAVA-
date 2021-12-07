import java.util.*;

class Digits
{
    Digits(int n){
        int temp = n;
        int[] array = new int[4];

        while(temp != 0){
            for(int i = 0; i < 4; i++){
                array[i] = temp%10;
                temp /= 10;
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = i+1; j < 4; j++){
                if(array[i] > array[j]){
                    int temp2 = array[j];
                    array[j] = array[i];
                    array[i] = temp2;
                }
            }
        }

        System.out.print("Digits in increasing order: ");
        for(int i = 0; i < 4; i++){
            System.out.print(array[i]);
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 digit number: ");
        int n = sc.nextInt();
        sc.close();

        int temp = n;
        int counter = 0;
        while(temp != 0){
            temp /= 10;
            counter++;
        }
        if(counter != 4){
            System.out.println("Not a 4 Digit Number.");
            return;
        }
        Digits number = new Digits(n);
    }
}
