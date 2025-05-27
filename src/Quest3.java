import java.util.ArrayList;

public class Quest3 {
    public static void main(String[] args) {
        ArrayList<String> frutinhas=new ArrayList<>();

        frutinhas.add("Maca");
        frutinhas.add("Banana");
        frutinhas.add("Abacaxi");
        frutinhas.add("Laranja");

        if (frutinhas.contains("Banana")){
            int idc=frutinhas.indexOf("Banana");
            System.out.println("Fruta encontrada" + " " + idc);
        }
        else {
            System.out.println("Nao achou");
        }

    }
}
