package fighter;

import weapon.IWeapon;

import java.util.ArrayList;

public class Dwarves extends Fighter {
    public Dwarves(String name, int maxHealthyPoints, ArrayList<IWeapon> weapons) {
        super(name, maxHealthyPoints, weapons);
    }
}
