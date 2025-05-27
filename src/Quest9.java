import java.util.HashMap;
import java.util.Scanner;

public class Quest9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                HashMap<String,Integer> pessoas=new HashMap<>();
                pessoas.put("Erlon",25);
                pessoas.put("Batman",40);
                pessoas.put("Eren",19);

                System.out.println("Informe seu nome: ");
                String name= sc.nextLine();
                if (pessoas.containsKey(name)){
                    System.out.println("Informe sua idade: ");
                    int idade= sc.nextInt();
                    System.out.println("Encontrado seu nome e sua idade sao: " + " " + name + " " + idade);
                }
                else {
                    System.out.println("Nome invalido");
                }

            }
        }


