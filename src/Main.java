import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao = 3;
        String Nome;
        String Numero;
        String nome;
        while ( opcao != 0){
        System.out.println("---- [ Lista Telefonica ] ----");
        System.out.println("1. Cadastrar Contato");
        System.out.println("2. Buscar Contato");
        System.out.println("0. Sair");
        System.out.println("-------------------------------");
            System.out.print("Opcao: ");
            opcao = ler.nextInt();

        switch (opcao){

            case 1 :
                System.out.println("Para cadastrar um novo contato entre com o nome e o numero de telefone dele!");
                System.out.print("Nome: ");
                Nome = ler.next();
                System.out.print("Numero: ");
                Numero = ler.next();
                Contatos.CadastrarContato(Nome, Numero);
                break;
            case 2 :
                System.out.println("---- [ Buscar numero de contato ] ----");
                System.out.println("Para buscar o numero do contato , por favor entre com o nome do contato: ");
                System.out.print("Nome: ");
                nome = ler.next();
                Contatos.BuscarContato(nome);

           }

       }
   }
}
