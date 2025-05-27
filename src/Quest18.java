import java.util.LinkedHashMap;

public class Quest18 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> pec=new LinkedHashMap<>();
        pec.put("Kaneki",19);
        pec.put("Kon",11);
        pec.put("Kilua",13);
        pec.put("Jason tood",23);
        pec.put("Goku black",41);
        System.out.println("Linked com o primeiro elemento: " + " " + pec);
        System.out.println();
        pec.remove("Kaneki");
        System.out.println("Linked sem o primeiro elemento: " + " " + pec);
    }
}
