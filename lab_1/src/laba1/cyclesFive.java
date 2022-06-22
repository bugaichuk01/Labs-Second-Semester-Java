package laba1;

import java.util.Scanner;

public class cyclesFive {
    public static void main(String[] args) {
        int count = 0, a = 1;
        System.out.println("Enter num: ");
        Scanner num = new Scanner(System.in);
        int arg = num.nextInt();
        for (int i = 0; i < arg; i++) {
            count++;
            a= a*count;
        }
        System.out.println(a);


    }
}
