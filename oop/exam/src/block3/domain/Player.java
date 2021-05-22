package block3.domain;

public class Player {

    private String username; // ник в игре
    private int experience; // опыт

    public Player() {
    }

    public Player(String username, int experience) {
        this.username = username;
        this.experience = experience;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", experience=" + experience +
                '}';
    }
}
