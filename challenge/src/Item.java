public class Item {

    private String weaponType;

    private int weaponDmg;

    public Item() {
    }

    public Item(String weaponType, int weaponDmg) {
        this.weaponType = weaponType;
        this.weaponDmg = weaponDmg;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getWeaponDmg() {
        return weaponDmg;
    }

    public String toString() {
        return this.weaponType + " has basic stat: " + this.weaponDmg;
    }
}
