package spell;

import enemy.Enemy;

public class IceBlast  implements ISpell{
    private int powerValue = 10;

    public void cast(Enemy enemy ) {
         enemy.takeDamage(this.powerValue);
    }

    public int getDamagePoints() {
        return this.powerValue;
    }


}
