package block3;

import block3.domain.Captain;
import block3.domain.Player;
import block3.domain.Team;
import block3.strategy.AttackBehavior;
import block3.strategy.PutBombBehavior;

public class Main {
    public static void main(String[] args) {

        Captain captain = Captain.getInstance();
        captain.setUsername("Captain123");
        captain.setExperience(5);

        Team counter = new Team();
        counter.setCaptain(captain);
        counter.addPlayer(new Player("random", 4));
        counter.addPlayer(new Player("unnamed", 2));
        counter.addPlayer(new Player("grekk", 1));
        counter.addPlayer(new Player("rlslfld", 3));

        counter.setStrategy(new AttackBehavior());
        counter.followStrategy();

        counter.setStrategy(new PutBombBehavior());
        counter.followStrategy();

        counter.info();
    }
}
