import java.util.HashMap;

public class MainPessoa {
    public static void main(String[] args) {
        HashMap<String,Pessoa> pessoaHashMap=new HashMap<>();

        pessoaHashMap.put("Batman",new Pessoa("Batman",31));
        pessoaHashMap.put("Coringa",new Pessoa("Coringa",41));
        pessoaHashMap.put("Superman",new Pessoa("Superman",29));

        for (int i=0;i<pessoaHashMap.size();i++){
            System.out.println(pessoaHashMap);
            break;
        }

    }
}
