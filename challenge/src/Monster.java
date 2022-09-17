import java.util.ArrayList;
import java.util.List;

// monster extends player
public class Monster implements ISavable {

    private int life;

    // when monster got hit, rage will increase by 30. If rage reaches >= 90,
    // and monster received half dmg if attacked by player one turn.
    // next move, monster inflicts triple dmg.
    private int rage;

    private List<Item> itemList = new ArrayList<>();

    public Monster(int life) {
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public void pickUp(Item item) {
        if (this.itemList.size() == 0) {
            this.itemList.add(item);
        } else {
            boolean hasExist = existItem(item);
            if (hasExist) {
                System.out.println("Already picked up item.");
            } else {
                this.itemList.add(item);
                System.out.println(item.getWeaponType() + " is added to list.");
            }
        }
    }

    @Override
    public Item selectBestWeapon(List<Item> itemList) {
        Item bestWeapon = new Item();
        for (int i = 0; i < itemList.size(); i++) {
            Item currentWeapon = itemList.get(i);
            if (currentWeapon.getWeaponDmg() > bestWeapon.getWeaponDmg()) {
                bestWeapon = currentWeapon;
            }
        }
        return bestWeapon;
    }

    @Override
    public Item selectBestWeapon() {
        Item bestWeapon = new Item();
        for (int i = 0; i < this.itemList.size(); i++) {
            Item currentWeapon = this.itemList.get(i);
            if (currentWeapon.getWeaponDmg() > bestWeapon.getWeaponDmg()) {
                bestWeapon = currentWeapon;
            }
        }
        return bestWeapon;
    }

    private boolean existItem(Item item) {
        for (Item checkedItem : this.itemList) {
            if (checkedItem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Item> getItem() {
        return this.itemList;
    }

    @Override
    public void populateItem(List<Item> itemList) {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
}
