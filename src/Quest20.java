import java.util.HashMap;
import java.util.Scanner;

public class Quest20 {
    public static void main(String[] args) {
        HashMap<Integer,String> semanaDay=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("            Menu             ");
        System.out.println("=============================");
        System.out.println("Informe uma op: ");
        System.out.println("(1) Exibir dias da semana");
        int op= sc.nextInt();
        if (op==1){
        System.out.println("Exibindo os dias da semana: ");
        semanaDay.put(1,"Segunda-feira");
        semanaDay.put(2,"Terca-feira");
        semanaDay.put(3,"Quarta");
        semanaDay.put(4,"Quinta-feira");
        semanaDay.put(5,"Sexta-feira");
        System.out.println(semanaDay);
        System.out.println("Alterar value da chave 3: ");
        semanaDay.remove(3);
        semanaDay.put(3,"Quarta-feira");
        System.out.println("Chave 3 atualizada, exibindo dias da semana" + " " + semanaDay);}
        else {
            System.out.println("Saindo do sistema");
        }


    }
}
