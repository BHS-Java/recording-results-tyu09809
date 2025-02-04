import java.util.ArrayList;
import java.util.List;

public class Game implements Results {
    private List<Person> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Person player) {
        players.add(player);
    }

    @Override
    public String getSummary() {
        StringBuilder summary = new StringBuilder();
        for (Person player : players) {
            summary.append(player.getResults().getSummary()).append("\n");
        }
        return summary.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Game game = new Game();

        System.out.println("Player 1:");
        Player player1 = main.makePerson("Name pls");
        player1.setAge(String.valueOf(main.askNumber("What age")));
        player1.setHeight(main.askString("How tall"));
        game.addPlayer(player1);

        System.out.println("Player 2:");
        Player player2 = main.makePerson("Name pls");
        player2.setAge(String.valueOf(main.askNumber("What age")));
        player2.setHeight(main.askString("How tall"));
        game.addPlayer(player2);

        System.out.println("Game Results:");
        System.out.println(game.getSummary());
    }
}
