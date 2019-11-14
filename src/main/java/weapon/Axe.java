package weapon;

public class Axe implements IWeapon{

    private int powerValue = 12;


    public int getDamage() {
        return this.powerValue;
    }
}
