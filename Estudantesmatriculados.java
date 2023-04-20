import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Estudantesmatriculados {
    private Set<String> estudante;

    public Estudantesmatriculados() {
        this.estudante = new HashSet<>();
    }

    public void addFollower(String estudante) {
        this.estudante.add(estudante);
    }

    public void removeFollower(String estudante) {
        this.estudante.remove(estudante);
    }

    public boolean hasFollower(String estudante) {
        return this.estudante.contains(estudante);
    }

    public static void main(String[] args) {
        Estudantesmatriculados estudantes = new Estudantesmatriculados();
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("Social Media Followers");
            System.out.println("1. Add follower");
            System.out.println("2. Remove follower");
            System.out.println("3. Check if follower exists");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter follower name: ");
                    String followerToAdd = input.next();
                    estudantes.addFollower(followerToAdd);
                    System.out.println("Follower added.");
                    break;
                case 2:
                    System.out.print("Enter follower name: ");
                    String followerToRemove = input.next();
                    estudantes.removeFollower(followerToRemove);
                    System.out.println("Follower removed.");
                    break;
                case 3:
                    System.out.print("Enter follower name: ");
                    String followerToCheck = input.next();
                    if (estudantes.hasFollower(followerToCheck)) {
                        System.out.println("Follower exists.");
                    } else {
                        System.out.println("Follower does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

            System.out.println();
        }

        input.close();
    }
}
