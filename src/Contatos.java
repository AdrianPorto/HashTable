import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Contatos {

   public static Hashtable<String,String> contatos = new Hashtable<String,String>();
        public static void CadastrarContato(String nome, String numero){
            contatos.put(nome,numero);
            System.out.println("Contato Cadastrado com sucesso!\n");

        }
    public  static void BuscarContato(String nome){
            if(contatos.get(nome) == null)
               System.out.println("Desculpa, Contato informado nao encontrado! Entre com outro número");
              else
                 System.out.println("O numero do contato " + nome + " e: " + contatos.get(nome));
    }
}
