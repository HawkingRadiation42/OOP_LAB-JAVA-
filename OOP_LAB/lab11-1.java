import java.io.*;
 
class Main {
    public static void main(String[] args)
    {
        try {
            int number[] = new int[10];
            number[12] = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println(
                "zero cannot divide any number. ");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Index is out of size for the array. ");
        }
    }
}


