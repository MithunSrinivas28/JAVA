import java.util.ArrayList;
import java.util.List;

class Team {

    private String teamName;

    private List<Player> players;

    public Team(String teamName) {

        this.teamName = teamName;

        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {

        players.add(player);
    }

    public void displayTeam() {

        System.out.println(
                "\nTeam: " + teamName
        );

        for(Player player : players) {

            player.displayStats();
        }
    }
}
