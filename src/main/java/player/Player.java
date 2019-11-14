package player;

public abstract class Player {
    private String name;
    private int maxHealthyPoints;
    private int currentHealthyPoints;

    public Player(String name, int maxHealthyPoints) {
        this.name = name;
        this.maxHealthyPoints = maxHealthyPoints;
        this.currentHealthyPoints =maxHealthyPoints;
    }

    public void takeDamage(int damage) {
        this.currentHealthyPoints -= damage;
    }

    public int getCurrentHealthyPoints() {
        return currentHealthyPoints;
    }
}
