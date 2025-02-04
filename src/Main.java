import java.util.Scanner;

public class Main implements Spec {
    Scanner scanner = new Scanner(System.in);

    public Player makePerson(String question) {
        System.out.println(question);
        String name = scanner.nextLine();
        return new Player(name);
    }

    public String askString(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int askNumber(String question) {
        System.out.println(question);
        String answer = scanner.nextLine();
        return Integer.parseInt(answer);
    }

    @Override
    public void addResults(Person player) {
    }

    public static void main(String[] args) {}
}
