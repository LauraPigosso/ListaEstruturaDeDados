import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaDeMusica {
    public static void main(String[] args) {
        ArrayList<String> musicas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar musica");
            System.out.println("2 - Remover musica");
            System.out.println("3 - Pesquisar musica");
            System.out.println("4 - Exibir lista de musicas");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da musica:");
                    String nome = scanner.nextLine();
                    musicas.add(nome);
                    System.out.println("Musica adicionado.");
                    break;
                case 2:
                    System.out.println("Digite o nome da musica a ser removido:");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = musicas.remove(nomeRemover);
                    if (removido) {
                        System.out.println("musica removida.");
                    } else {
                        System.out.println("musica não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome da musica a ser pesquisado:");
                    String nomePesquisar = scanner.nextLine();
                    if (musicas.contains(nomePesquisar)) {
                        System.out.println("Musica encontrada.");
                    } else {
                        System.out.println("musica não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de musicas:");
                    for (String musica : musicas) {
                        System.out.println(musica);
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