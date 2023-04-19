import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeContatos {
    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Pesquisar contato");
            System.out.println("4 - Exibir lista de contatos");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();
                    contatos.add(nome);
                    System.out.println("Contato adicionado.");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato a ser removido:");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = contatos.remove(nomeRemover);
                    if (removido) {
                        System.out.println("Contato removido.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do contato a ser pesquisado:");
                    String nomePesquisar = scanner.nextLine();
                    if (contatos.contains(nomePesquisar)) {
                        System.out.println("Contato encontrado.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de contatos:");
                    for (String contato : contatos) {
                        System.out.println(contato);
                    }
                    break;
                case 0:
                    System.out.println("Encerrando programa.");
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}