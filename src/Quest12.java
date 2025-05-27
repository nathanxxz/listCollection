import java.util.LinkedList;

public class Quest12 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros= new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println("Antes de add: ");
        System.out.println(numeros);
        numeros.addFirst(0);
        numeros.addLast(6);
        System.out.println("Depois de add: ");
        System.out.println(numeros);



    }
}
