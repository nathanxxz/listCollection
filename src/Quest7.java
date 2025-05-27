import java.util.HashSet;

public class Quest7 {
    public static void main(String[] args) {
        HashSet<Integer> nums=new HashSet<>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);

        if (nums.contains(15)){
            System.out.println("Esta presente");
        }
        else {
            System.out.println("Nao esta");
        }
    }
}
