import java.util.ArrayList;
import java.util.List;

public class Game implements Results {
    private List<Person> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public Game(List<Person> players) {
        this.players = players;
    }

    public void addPlayer(Person player) {
        players.add(player);
    }

    public void loadPlayers(String filePath) {
        PlayerLoader loader = new PlayerLoader();
        List<Person> loadedPlayers = loader.loadPlayers(filePath);
        players.addAll(loadedPlayers);
    }

    public void selectPlayer(int index) {
        if (index >= 0 && index < players.size()) {
            Person selectedPlayer = players.get(index);
            System.out.println("Selected Player: " + selectedPlayer.getName());
        } else {
            System.out.println("Invalid player index.");
        }
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

        game.loadPlayers("players.csv");

        game.selectPlayer(0); 

        StairDrawer stairDrawer = new StairDrawer();
        String direction = main.askString("gimme direction (up, down, upside down, upside down left):");
        stairDrawer.drawStairs(direction);

        System.out.println("Game Results fam");
        System.out.println(game.getSummary());
    }
}
