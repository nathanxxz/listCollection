import java.util.ArrayList;

public class Quest2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Array completo\n");
        for(int i=0;0<numeros.size();i++){
            System.out.println(numeros);
            break;
        }
        System.out.println();
        System.out.println("Array sem o index 2\n");
        numeros.remove(2);
        for(int i=0;0<numeros.size();i++){
            System.out.println(numeros);
            break;
    }
    }}

