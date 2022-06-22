import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar1[] = new int[6];
        int ar2[] = new int[6];
        System.out.println("Введите 5 чисел (карт) первого игрока");
        for(int p = 0; p < 5; p++) {
            ar1[p] = sc.nextInt();
        }
        System.out.println("Введите 5 чисел (карт) второго игрока");
        for(int o = 0; o < 5; o++) {
            ar2[o] = sc.nextInt();
        }
        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            arr1.push(ar1[i]);
            arr2.push(ar2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int j = 0; j < 106; j++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.push(arr1.get(0));
                arr1.push(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.push(arr2.get(0));
                arr2.push(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}