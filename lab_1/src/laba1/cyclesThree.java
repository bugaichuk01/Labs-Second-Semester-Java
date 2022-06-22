package laba1;

import java.util.Scanner;

public class cyclesThree {
    public static void main(String[] args) {
        float n = 1, m = 1, p = 0;
        for(int i = 0; i < 10; i++){
            p = n/m;
            m = m + 1;
            System.out.println(p);
        }
    }
}
