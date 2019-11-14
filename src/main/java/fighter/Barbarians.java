package fighter;


import weapon.IWeapon;

import java.util.ArrayList;

public class Barbarians extends Fighter {
    public Barbarians(String name, int maxHealthyPoints, ArrayList<IWeapon> weapons) {
        super(name, maxHealthyPoints, weapons);
    }
}
