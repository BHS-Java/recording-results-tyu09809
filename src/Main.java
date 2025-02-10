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

    public static void main(String[] args) {
        Main main = new Main();
        Game game = new Game();

        game.loadPlayers("players.csv");
        int playerIndex = main.askNumber("index for player pls (0 for first player):");
        game.selectPlayer(playerIndex); 
        String direction = main.askString("direction to draw stairs pls (up, down, upside down, upside down left):");
        StairDrawer stairDrawer = new StairDrawer();
        stairDrawer.drawStairs(direction);
        System.out.println("Game Results pls:");
        System.out.println(game.getSummary());
    }
}
