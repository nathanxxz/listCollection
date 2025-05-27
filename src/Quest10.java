import java.util.Scanner;
import java.util.TreeMap;

public class Quest10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeMap<String,Integer> pessoas=new TreeMap<>();
        pessoas.put("Ludgero",31);
        pessoas.put("Rene",35);
        pessoas.put("Ze neto",22);
        pessoas.put("Erica",28);
        pessoas.put("ErlonGeek",25);

        for (String nome:pessoas.keySet()){
            System.out.println("Informe sua idade: ");
             int idade=pessoas.get(nome);
            if (idade % 2==0){
                System.out.println("Seu nome e sua idade sao: " + " " + nome + " " + idade);
            }
            else {
                System.out.println("Infelizmente sua idade é impar, nao vou te imprimir");
            }
        }
    }
}
