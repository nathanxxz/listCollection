import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Quest4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<>(6);
        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}