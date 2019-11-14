package fighter;

import weapon.IWeapon;

import java.util.ArrayList;

public class Knights  extends Fighter{
    public Knights(String name, int maxHealthyPoints, ArrayList<IWeapon> weapons) {
        super(name, maxHealthyPoints, weapons);
    }
}
