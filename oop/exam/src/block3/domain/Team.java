package block3.domain;

import block3.strategy.TeamBehavior;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private Captain captain;
    private List<Player> players; //список игроков
    protected TeamBehavior teamBehavior;


    public Team() {
        players = new ArrayList<>();
    }

    public void info() {
        System.out.println("Captain: " + captain.getUsername());
        System.out.print("players size - " + players.size() + ": ");
        for (Player p : players) {
            System.out.print(p.getUsername() + " ");
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void deletePlayer(Player player) {
        players.remove(player);
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setStrategy(TeamBehavior teamBehavior) {
        this.teamBehavior = teamBehavior;
    }

    public void followStrategy() {
        teamBehavior.useStrategy();
    }
}
