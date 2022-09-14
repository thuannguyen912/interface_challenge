public class Item {

    private String weaponType, weaponDmg;

    public Item(String weaponType, String weaponDmg) {
        this.weaponType = weaponType;
        this.weaponDmg = weaponDmg;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getWeaponDmg() {
        return weaponDmg;
    }

    public String toString() {
        return this.weaponType + " has basic stats: " + this.weaponDmg;
    }
}
