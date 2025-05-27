import java.util.ArrayList;

public class Quest19 {
    public static void main(String[] args) {
        ArrayList<Integer> doisArray=new ArrayList<>();
        ArrayList<Integer> doisArray2=new ArrayList<>();
        System.out.println("Inserindo primeiro array: ");
        doisArray.add(1);
        doisArray.add(2);
        doisArray.add(3);
        System.out.println("Valores inseridos");
        System.out.println("Inserindo segundo array: ");
        doisArray2.add(1);
        doisArray2.add(2);
        doisArray2.add(3);
        System.out.println("Valores inseridos");
        System.out.println("Unindo as arrays: ");
        doisArray.addAll(doisArray2);
        System.out.println("Arrays unidas");
        System.out.println("Valor das arrays unidas é: " + " " + doisArray);

    }
}
