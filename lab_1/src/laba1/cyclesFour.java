package laba1;

public class cyclesFour {
    public static void main(String[] args) {
        int  a[] = new int[(int) (Math.random() * 20)];
        int n = 0, m = 1, p, o;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int j = 1; j < a.length; j++) {
            n++;
            p = a[j];
            o = j - 1;
            while ((p < a[o]) && (p >= 0)) {
                a[o + 1] = a[o];
                o = o - 1;
                n++;
                a[o + 1] = p;
                if (o < 0) o = 0;
            }
        }
            for(int h = 0; h < a.length; h++) {
                System.out.print(a[h] + " ");
            }
        }
    }


