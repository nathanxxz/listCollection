import java.util.HashSet;

public class Quest6 {
    public static void main(String[] args) {
        HashSet<String> cidades=new HashSet<>();
        cidades.add("Lagoa");
        cidades.add("Pombal");
        cidades.add("Sousa");
        cidades.add("Cajazeiras");
        cidades.add("Patos");

        for (String cdd : cidades){
            System.out.println(cdd);
        }
    }
}
