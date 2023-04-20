import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SocialMediaFollowers {
    private Set<String> seguidores;

    public SocialMediaFollowers() {
        this.seguidores = new HashSet<>();
    }

    public void addFollower(String follower) {
        this.seguidores.add(follower);
    }

    public void removeFollower(String follower) {
        this.seguidores.remove(follower);
    }

    public boolean hasFollower(String follower) {
        return this.seguidores.contains(follower);
    }

    public int getTotalFollowers() {
        return this.seguidores.size();
    }

    public static void main(String[] args) {
        SocialMediaFollowers followers = new SocialMediaFollowers();
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("Social Media Followers");
            System.out.println("1. Add follower");
            System.out.println("2. Remove follower");
            System.out.println("3. Check if follower exists");
            System.out.println("4. Display total followers");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter follower name: ");
                    String followerToAdd = input.next();
                    followers.addFollower(followerToAdd);
                    System.out.println("Follower added.");
                    break;
                case 2:
                    System.out.print("Enter follower name: ");
                    String followerToRemove = input.next();
                    followers.removeFollower(followerToRemove);
                    System.out.println("Follower removed.");
                    break;
                case 3:
                    System.out.print("Enter follower name: ");
                    String followerToCheck = input.next();
                    if (followers.hasFollower(followerToCheck)) {
                        System.out.println("Follower exists.");
                    } else {
                        System.out.println("Follower does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("Total followers: " + followers.getTotalFollowers());
                    break;
                case 5:
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
