package spell;

import enemy.Enemy;

public class FireBall implements ISpell {
    private int powerValue = 15;

    public void cast(Enemy enemy ) {
        enemy.takeDamage(this.powerValue);
    }

    public int getDamagePoints() {
        return this.powerValue;
    }

}
