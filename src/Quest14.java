import java.util.LinkedList;
import java.util.Queue;

public class Quest14{
    public static void main(String[] args) {
        Queue<Integer> nums=new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println("Numeros add: " + " " + nums);
        System.out.println();
        System.out.println("Removendo da list: ");
        while (!nums.isEmpty()){
            nums.remove();
            System.out.println("Removido: " + " " + nums);
        }

    }
}
