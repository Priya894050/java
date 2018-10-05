import java.io.*;
import java.util.*;
class Main {
Scanner Sc=new Scanner(System.in);
    public static void main(String[] args) {

        int num = 88, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}