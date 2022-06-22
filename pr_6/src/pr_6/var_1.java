package pr_6;

public class var_1 {
    public static void main(String[] args) {
        Student first = new Student();
        first.SortArray();
        first.Output();
    }
}

class Student {

    public int idNumber[];

    public Student() {
        idNumber = new int[10];
        idNumber[0] = 12;
        idNumber[1] = 14;
        idNumber[2] = 8;
        idNumber[3] = 18;
        idNumber[4] = 22;
        idNumber[5] = 16;
        idNumber[6] = 26;
        idNumber[7] = 11;
        idNumber[8] = 1;
        idNumber[9] = 50;
    }

    public void SortArray() {
        for (int i = 0; i < idNumber.length; i++) {
            int min = idNumber[i];
            int min_i = i;
            for (int j = i + 1; j < idNumber.length - 1; j++)
                if (idNumber[j] < min) {
                    min = idNumber[j];
                    min_i = j;
                }
            if (i != min_i) {
                int tmp = idNumber[i];
                idNumber[i] = idNumber[min_i];
                idNumber[min_i] = tmp;
            }
        }
    }

    public void Output() {
        for (int sort : idNumber) {
            System.out.println(sort);
        }
    }
}