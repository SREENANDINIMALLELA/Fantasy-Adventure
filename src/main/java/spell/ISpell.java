package spell;

import enemy.Enemy;

public interface ISpell {
    public void cast(Enemy enemy);

    int getDamagePoints();
}
