package enemy;

import player.Player;
import weapon.IWeapon;

public  abstract class Enemy {
    private int healthPoints;
    private IWeapon weapon;

    public Enemy(int healthPoints, IWeapon weapon) {
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public void takeDamage(int i ) {
        this.healthPoints -= i;
    }
    public void useWeapon(Player player){
        player.takeDamage(weapon.getDamage());
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
