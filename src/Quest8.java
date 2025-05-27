import java.util.HashMap;

public class Quest8 {
    public static void main(String[] args) {
        HashMap<String,Integer> pessoas=new HashMap<>();
        pessoas.put("Erlon",25);
        pessoas.put("Batman",40);
        pessoas.put("Eren",19);

        for (Integer idade:pessoas.values()){
            if (idade % 2==0){
                System.out.println("Pares: " + " " + idade);

            }
            else {
                System.out.println("Impares" + " " + idade);
            }
        }

    }
}
