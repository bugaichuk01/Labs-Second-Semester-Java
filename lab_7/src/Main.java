import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(1);
        nums.add(23);
        nums.add(44);
        nums.add(1,66);
        nums.addLast(99);
        nums.addFirst(5);

        System.out.printf("В списке %d элементов \n", nums.size());
        System.out.println(nums.get(1));

        if(nums.contains(44)) {
            System.out.println("44 в диапазоне");
        }
    }

}
