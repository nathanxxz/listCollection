import java.util.Stack;

public class Quest15 {
    public static void main(String[] args) {
        Stack<String> abc=new Stack<>();
        abc.add("A");
        abc.add("B");
        abc.add("C");
        abc.add("D");
        System.out.println("Valores iniciais inseridos: " + " " + abc);
        System.out.println();
        System.out.println("Removendo: ");
        while (!abc.isEmpty()){
            abc.pop();
            System.out.println("Removido: " + " " + abc);
        }
    }
}
