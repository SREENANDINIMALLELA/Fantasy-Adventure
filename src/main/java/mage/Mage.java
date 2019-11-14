package mage;

import enemy.Enemy;
import player.Player;
import spell.ISpell;

public abstract class Mage extends Player {
    private int damagePoints;
    private ISpell spell;
    public Mage(String name, int maxHealthyPoints) {
        super(name, maxHealthyPoints);
    }

    public String castSpell( Enemy enemy) {
        enemy.takeDamage(spell.getDamagePoints());
        return "MAGIC ATTACK!!!";
    }
}
