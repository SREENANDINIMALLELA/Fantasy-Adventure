package fighter;

import enemy.Enemy;
import player.Player;
import weapon.IWeapon;

import java.util.ArrayList;
public abstract class Fighter extends Player {

    private ArrayList<IWeapon> weapons;
    private IWeapon currentWeapon;
    public Fighter(String name, int maxHealthyPoints,ArrayList<IWeapon> weapons) {
        super(name, maxHealthyPoints);
        this.weapons=weapons;
        this.currentWeapon = this.weapons.get(0);
    }

    public void selectWeapon(IWeapon weapon){
        this.currentWeapon= weapon;
    }

    public String useWeapon( Enemy enemy) {
        enemy.takeDamage(20);
        return "You've been attacked!";
    }



}
