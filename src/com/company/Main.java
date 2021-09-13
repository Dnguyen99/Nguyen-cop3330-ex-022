package com.company;
import java.util.*;

public class Main {
    public static boolean contain(int[] num, int x) {
        for(int n : num)
            if(n == x)
                return true;

            return false;
    }
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int[] num = new int[100];
    int count = 0;
    int highest = 0;
    while(true) {
        System.out.print("Enter any number (-1 to stop): ");
        int x = scan.nextInt();
        if(x == -1)
            break;
        if(contain(num, x)) {
            System.out.print("Already entered this number. Please enter a new number: ");
            continue;
        }

        num[count++] = x;
        highest = Math.max(x, highest);
    }

        System.out.println("The largest number is: " +highest+ ".");
        scan.close();
    }
}
