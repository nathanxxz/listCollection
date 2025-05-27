import java.util.HashSet;
import java.util.TreeSet;

public class Quest17 {
    public static void main(String[] args) {
        HashSet<Integer> nums1=new HashSet<>();
        nums1.add(5);
        nums1.add(2);
        nums1.add(9);
        nums1.add(3);
        nums1.add(7);
        System.out.println("Imprimindo o hashSet: " + " " + nums1);
        System.out.println();
        TreeSet<Integer> nums2=new TreeSet<>();
        nums2.add(5);
        nums2.add(2);
        nums2.add(9);
        nums2.add(3);
        nums2.add(7);
        System.out.println("Imprimindo o treeSet: " + " " + nums2);
        System.out.println();

        //O hastSet nunca vai manter uma ordem e pode aparecer aleatoria ele é mais utilizado em op basicas, add ou remover

        //Ja o treeSet ele vai manter os elementos em ordem automatica

    }
}
