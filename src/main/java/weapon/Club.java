package weapon;

public class Club implements IWeapon{

    private int powerValue = 12;


    public int getDamage() {
        return this.powerValue;
    }
}
