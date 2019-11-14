package weapon;

public class Sword implements IWeapon {

    private int powerValue = 8;


    public int getDamage() {
        return this.powerValue;
    }
}
