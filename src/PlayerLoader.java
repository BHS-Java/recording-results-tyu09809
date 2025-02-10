import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerLoader {
    public List<Person> loadPlayers(String filePath) {
        List<Person> players = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 3) {
                    Player player = new Player(data[0]);
                    player.setHeight(data[1]);
                    player.setAge(data[2]);
                    players.add(player);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return players;
    }
}
