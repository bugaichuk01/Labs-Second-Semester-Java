package laba1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] af = new int[10], aw = {1, 3, 4, 5, 7}, awd = {3, 8, 10};
        int n = 0, m = 0, k = 0, p = 0, t = 0;
        System.out.println("Введите 10 чисел массива:");
        for (int i = 0; i < 10; i++) {
            af[i] = input.nextInt();
            n = af[i] + n;
        }
        while(m < aw.length) {
            k = k + aw[m];
            m++;

        }
        do {
            p = p + awd[t];
            t++;
        } while (t < awd.length);
        System.out.println("Сумма элементов первого массива:" + n);
        System.out.println("Сумма элементов второго массива:" + k);
        System.out.println("Сумма элементов третьего массива:" + p);
    }
}
